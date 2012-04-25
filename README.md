Android-Oblig4--Rebusl-p
========================

Karaktergivende oppgave vår 2012. 

Rebusløp for Android:
Det skal utvikles et system som kan brukes til å arrangere enkle rebusløp. Vha. systemet skal en
gruppe deltakere kunne konkurrere om å finne et antall forhåndsdefinerte punkter i
terrenget/byen/nærområdet raskest mulig.

Systemet skal implementeres som en Android‐applikasjon og tilhørende webtjeneste/serverløsning
som applikasjonen kommuniserer med. Ved hjelp av forhåndsdefinerte rebuser skal applikasjonen
veilede deltakeren til de ulike punktene som inngår i rebusløpet. Litt av poenget med applikasjonen
er at det ikke skal være nødvendig å plassere fysiske gjenstander/og eller personer ute i terrenget
som sjekker at deltakeren har vært ved punktene.

Ved oppstart får deltakeren en oppstartsrebus som vil gi deltakeren et hint om hvor første punkt er.
Når deltakeren finner punktet (innafor en definert ”treffradius”) skal informasjon om deltaker,
posisjon/punkt, dato/klokke sendes til serveren. Dersom dette var forventet punkt svarer serveren
med å sende en ny rebus som gir hint om hvor neste punkt er, deltakeren leter til han finner dette
osv. Den som først har funnet f.eks. 10 punkter har vunnet.

Deltakeren skal til en hver tid, fra applikasjonen, kunne fremvise et kart (Google map) som viser
deltakerens posisjon og bevegelser. Vha. kartet kan deltakeren se om det er noe interessant (punktet
det søkes etter) i nærheten.

Oppsett av et nytt rebusløp gjøres via standard nettleser/webgrensenitt. Informasjon om et rebusløp
er typisk:
‐ navn
‐ dato & klokkeslett for oppstart
‐ maks varighet (i minutter, f.eks. 90 minutter)
‐ antall punkter (og rebuser)
‐ informasjon om hvert punkt som inngår i rebusløpet, som f.eks.:
o navn på punktet, GPS‐posisjon, radius (hvor nært er godkjent ”treff”)
o rebus
o rekkefølgen på punktene
‐ åpent løp eller ikke (må brukerne være registrert eller ikke)

Fra Android‐applikasjonen skal det også være mulig å vise en liste med alle registrerte løp (og antall
påmedte) slik at deltakeren kan velge et løp og melde seg på. Etter at påmelding er gjort skal appen
initiere en Alarm som (evt. en Service), på klokkeslettet for oppstart, sørger for å kontakte
webtjenesten for å få lastet ned første rebus for dette løpet. Denne vises for eksempel som en
Notification for brukeren (+ et lydsignal e.l.) og spillet er så i gang. Det er da opp til deltakeren å løse
rebusen, finne første punkt osv.

Når tiden er ute skal det fra appen være mulig å laste ned en resultatliste. Android‐applikasjonen skal
lagre informasjon om rebusløpet (for eksempel navn, dato/klokke, plassering og punkter som inngikk
i løpet). Appen skal dermed ta vare på informasjon om alle løp slik at brukeren på et senere
tidspunkt skal kunne fremvise punktene som inngikk i et løp på et kart.

På serverens hjemmeside bør det være mulig å få frem lista med kommende rebusløp.

Serveren kan f.eks. være basert på servlets men dere kan fritt velge serverteknologi.

Det er også mulig å definere sine egne tilleggsregler og evt. annen funksjonalitet. Gjør forøvrig
nødvendige forutsetninger og begrensninger.

Elementer:
‐ Nettverkskommunikasjon og webtjeneste .
‐ Posisjonering og kart/Google maps, proximity alarm.
‐ Datalagring.
‐ Bruk av Alarm & AlarmManager

Mulige tillegg (ikke påkrevd):
‐ Alle ser alle andre deltakere på kartet.
‐ Meldingsutveksling mellom deltakerne (innad i applikasjonen).
‐ På kartet kan det vises et enkelt kompass, det holder å vise en nål som hele tiden peker mot
nord.

Vurderingskriterier:
‐ Kodestruktur & ryddighet
‐ Kreativitet i forhold til GUI, brukervennlighet
‐ Bruk av de teknikker og mekanismer som vi har vært gjennom i faget
‐ Funksjonalitet, dvs. hvor mye av det som er spesifisert som fungerer (og hvordan). Evt. ekstra
funksjonalitet utover det spesifiserte (mulige tillegg) kan telle positivt.
‐ Dokumentasjon av koden (i henhold til javadoc‐standarden slik at javadoc kan genereres).

Innlevering:
‐ Besvarelsen leveres som en gruppeoppgave med 2‐3 personer.
‐ Kildekode (.java filer).
‐ Et dokument som beskriver hvordan systemet fungerer (inkl. regler) og en kort brukerveiledning.
‐ Skal kunne kjøres og demonstreres (for faglærer, på forespørsel) i emulator.
‐ Kildekoden til tjenerløsninga skal også leveres (og være oppegående og tilgengelig for testing).

Applikasjonen kan for eksempel testes ved å bruke vedlagte .gpx fil og definere rebuspunkter langs
denne ruta.

Tips:
Husk at dette betyr at Android‐applikasjonen er på nett – forsøk å minimere nettverkstrafikken.
Applikasjonen forutsetter at telefonen har kontinuerlig nettverksforbindelse.
Start gjerne med å få opp en Activity som viser og sporer brukerens posisjon. Legg til et rebuspunkt
og test at du får proximity‐alert når brukeren nærmer seg punktet. Dette skal kunne testes ved å
bruke vedlagte .gpx fil og legge et rebuspunkt Day2‐ruta. Når du starter .gpx fila (fra DDBMS)
simulerer dette brukerens bevegelser. Når han nærmer seg det definerte punktet fanges
”nærhetsalarmen” opp. Tjeneren kontaktes som returnerer en ny rebus og rebuspunkt som settes
vha. proximity‐alert osv. Test for eksempel med følgende punkter (ligger på Day2‐ruta) angitt i
mikrograder (latitude/longitude):