class Product:
    def __init__(self, product_id, name, price, quantity):
        self.product_id = product_id
        self.name = name
        self.price = price
        self.quantity = quantity

class ShoppingCart:
    def __init__(self):
        self.cart = []

    def add_to_cart(self, product, quantity):
        """
        Add a product to the shopping cart with specified quantity.
        """
        self.cart.append((product, quantity))

    def remove_from_cart(self, product_id):
        """
        Remove a product from the shopping cart based on product ID.
        """
        for item in self.cart:
            if item[0].product_id == product_id:
                self.cart.remove(item)
                return True
        return False

    def view_cart(self):
        """
        View all products in the shopping cart.
        """
        if not self.cart:
            print("Your cart is empty!")
        else:
            print("Product ID | Name | Price | Quantity")
            print("-------------------------------------")
            for item in self.cart:
                product = item[0]
                quantity = item[1]
                print(f"{product.product_id} | {product.name} | {product.price} | {quantity}")

def main():
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

if __name__ == "__main__":
    main()
