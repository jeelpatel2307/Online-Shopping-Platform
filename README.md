## Online Shopping Platform

The Online Shopping Platform is a Python program that simulates basic functionalities of an online shopping platform. It allows users to add products to a shopping cart, remove products from the cart, and view the contents of the cart.

### Features

- Add to Cart: Users can add products to the shopping cart with specified quantities.
- Remove from Cart: Users can remove products from the shopping cart based on product ID.
- View Cart: Users can view all the products currently in the shopping cart.

### How to Use

1. Create instances of the `Product` class with product details such as product ID, name, price, and quantity.
2. Add products to the shopping cart using the `add_to_cart` method of the `ShoppingCart` class.
3. View the contents of the shopping cart using the `view_cart` method.
4. Remove products from the shopping cart using the `remove_from_cart` method based on their product ID.

### Example

```python
# Initialize ShoppingCart
shopping_cart = ShoppingCart()

# Sample products
product1 = Product(1, "Laptop", 1000, 1)
product2 = Product(2, "Headphones", 50, 2)
product3 = Product(3, "Phone", 500, 1)

# Add products to the shopping cart
shopping_cart.add_to_cart(product1, 1)
shopping_cart.add_to_cart(product2, 2)
shopping_cart.add_to_cart(product3, 1)

# View cart
shopping_cart.view_cart()

# Remove product from cart
shopping_cart.remove_from_cart(2)

# View cart after removal
shopping_cart.view_cart()

```

### Contributing

Contributions to improve the Online Shopping Platform project are welcome! Fork the repository, make your changes, and submit a pull request.

### Credits

This project was created by Jeel patel
