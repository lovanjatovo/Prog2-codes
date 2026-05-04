export function getIvandryCount (addresses) {
  const place = 'ivandry';
  let habitantIvandry = 0;
  for (let places of addresses) {
    if (places.toLowerCase().includes(place)) {
      habitantIvandry = habitantIvandry + 1;
    }
  }
  return habitantIvandry;
}

console.log(
  getIvandryCount([
    'ivandry uowe ',
    'IVANdry fjkd',
    ' not ivandry ',
    'Ambanidia lot VS 66 dda',
    "IVanDry district tsarasaotra "
  ])
);

