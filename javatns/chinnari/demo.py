
import tkinter as tk
from tkinter import messagebox

# Function to check login
def login():
    username = entry_username.get()
    password = entry_password.get()

    # Dummy check (you can replace with DB or file verification)
    if username == "admin" and password == "1234":
        messagebox.showinfo("Login Successful", f"Welcome {username}!")
    else:
        messagebox.showerror("Login Failed", "Invalid Username or Password")

# Create main window
root = tk.Tk()
root.title("Login System")
root.geometry("400x250")
root.config(bg="#f3e6f0")  # background color

# Title Label
label_title = tk.Label(root, text="Login", font=("Arial", 18, "bold"), bg="#e6f2f3")
label_title.pack(pady=15)

# Frame for input fields
frame = tk.Frame(root, bg="#e8ccda", padx=20, pady=20)
frame.pack(pady=10)

# Username Label & Entry
label_username = tk.Label(frame, text="Username:", font=("Arial", 12), bg="#d6cce8")
label_username.grid(row=0, column=0, pady=5, sticky="w")
entry_username = tk.Entry(frame, width=25)
entry_username.grid(row=0, column=1, pady=5)

# Password Label & Entry
label_password = tk.Label(frame, text="Password:", font=("Arial", 12), bg="#d6cce8")
label_password.grid(row=1, column=0, pady=5, sticky="w")
entry_password = tk.Entry(frame, width=25, show="*")
entry_password.grid(row=1, column=1, pady=5)

# Login Button
btn_login = tk.Button(root, text="Login", font=("Arial", 12, "bold"), command=login, bg="#6966b2", fg="white")
btn_login.pack(pady=10)

root.mainloop()