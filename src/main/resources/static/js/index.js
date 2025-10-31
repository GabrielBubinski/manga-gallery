
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