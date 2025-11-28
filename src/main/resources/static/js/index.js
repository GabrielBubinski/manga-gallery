
fetch('http://localhost:8080/manga')
    .then(response => response.json())
    .then(data => {
        const lista = document.getElementById('lista-mangas');
        data.forEach(manga => {
            const card = document.createElement('div');
            card.className = 'card';
            card.innerHTML = `
                        <img src="${manga.imageUrl}" alt="${manga.name}">
                        <h3>${manga.name}</h3>
                    `;
            lista.appendChild(card);
        });
    });

fetch('http://localhost:8080/logo')
    .then(response => response.json())
    .then(data => {
        const logoContainer = document.getElementById('logo-container');
        data.forEach(logoData => {
            const logo = document.createElement('img');
            logo.src = logoData.logoUrl;
            logo.alt = 'Logo do site';
            logo.className = 'Image-logo';
            logoContainer.appendChild(logo);
        });
    });