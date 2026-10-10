const API = "http://localhost:8080/products";

// Load products
function loadProducts() {
    fetch(API)
        .then(res => res.json())
        .then(data => {
            let table = document.getElementById("productTable");
            table.innerHTML = "";

            data.forEach(p => {
                table.innerHTML += `
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.name}</td>
                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td>${p.category}</td>
                    </tr>
                `;
            });
        });
}

// Add product
function addProduct() {
    let product = {
        name: document.getElementById("name").value,
        price: document.getElementById("price").value,
        quantity: document.getElementById("quantity").value,
        category: document.getElementById("category").value
    };

    fetch(API, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    })
        .then(() => {
            loadProducts();
        });
}

// Load on start
window.onload = loadProducts;