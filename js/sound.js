/* Cowlsly Sound System v3 - Additive Synthesis */

let audioContext;
let masterVolume = 0.65;

function initAudio() {
  if (!audioContext) {
    audioContext = new (window.AudioContext || window.webkitAudioContext)();
  }
  if (audioContext.state === 'suspended') {
    audioContext.resume();
  }
}

function setVolume(volume) {
  masterVolume = Math.max(0, Math.min(1, volume));
}

function getVolume() {
  return masterVolume;
}

function playButtonSound(type = 'click') {
  if (!audioContext) initAudio();

  const now = audioContext.currentTime;
  const fundamental = type === 'click' ? 720 : 580;

  const harmonics = type === 'click' 
    ? [1.0, 2.02, 3.01, 4.15] 
    : [1.0, 1.98, 3.05];

  const gains = type === 'click' 
    ? [0.55, 0.32, 0.18, 0.09] 
    : [0.6, 0.35, 0.22];

  harmonics.forEach((mult, i) => {
    const osc = audioContext.createOscillator();
    const gain = audioContext.createGain();

    osc.type = 'sine';
    osc.frequency.value = fundamental * mult;

    gain.gain.value = 0.001;
    gain.gain.linearRampToValueAtTime(masterVolume * gains[i], now + 0.008);
    gain.gain.linearRampToValueAtTime(0.001, now + (type === 'click' ? 0.18 : 0.32));

    osc.connect(gain);
    gain.connect(audioContext.destination);

    osc.start(now);
    osc.stop(now + (type === 'click' ? 0.25 : 0.4));
  });
}

function playErrorSound() {
  if (!audioContext) initAudio();

  const now = audioContext.currentTime;
  const fundamental = 260;

  const harmonics = [1.0, 2.03, 2.97, 4.1];
  const gains = [0.7, 0.4, 0.25, 0.12];

  harmonics.forEach((mult, i) => {
    const osc = audioContext.createOscillator();
    const gain = audioContext.createGain();

    osc.type = 'sine';
    osc.frequency.value = fundamental * mult;

    gain.gain.value = 0.001;
    gain.gain.linearRampToValueAtTime(masterVolume * gains[i], now + 0.01);

    osc.frequency.linearRampToValueAtTime(fundamental * mult * 0.6, now + 0.35);
    gain.gain.linearRampToValueAtTime(0.001, now + 0.42);

    osc.connect(gain);
    gain.connect(audioContext.destination);

    osc.start(now);
    osc.stop(now + 0.5);
  });
}

function attachButtonSound(button, validationFn = null) {
  button.addEventListener('click', (e) => {
    if (validationFn && !validationFn()) {
      e.preventDefault();
      playErrorSound();
    } else {
      playButtonSound('click');
    }
  });
}

window.CowlslySound = {
  playButtonSound,
  playErrorSound,
  setVolume,
  getVolume,
  attachButtonSound
};