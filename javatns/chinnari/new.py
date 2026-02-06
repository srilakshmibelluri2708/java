import sqlite3 
conn = sqlite3.connect('students.db')
cursor=conn.cursor()

cursor.execute("""
CREATE TABLE IF NOT EXISTS student(
               id INTEGER PRIMARY KEY AUTOINCREMENT,
               name TEXT NOT NULL,
               age INTEGER,
               grade TEXT)
               """)
conn.commit()
from tkinter import * 
def save_data():
    conn=sqlite3.connect("students.db")
    cursor=conn.cursor()
    cursor.execute("INSERT INTO student (name,age,grade) VALUES (?,?,?)",
                   (entry_name.get(),entry_age.get(),entry_grade.get()))
    conn.commit()
    conn.close()
    label_msg.config(text="data saved successfully",fg="green")
root=Tk() 
root.title("this is a student database")
Label(root,text='Name').grid(row=0,column=0)   
Label(root,text='Age').grid(row=1,column=0)   
Label(root,text='Grade').grid(row=2,column=0)  
entry_name=Entry(root) 
entry_age=Entry(root) 
entry_grade=Entry(root)
entry_name.grid(row=0,column=1) 
entry_age.grid(row=1,column=1) 
entry_grade.grid(row=2,column=1) 
Button(root,text='save',command=save_data).grid(row=3,column=1)
label_msg=Label(root,text="")
label_msg.grid(row=4,column=0,columnspan=2)

def show_data():
    conn=sqlite3.connect("students.db")
    cursor=conn.cursor() 
    cursor.execute("SELECT * FROM student")
    rows=cursor.fetchall()
    conn.close()
    text_area.delete(1.0,END)
    for row in rows:
        text_area.insert(END,f"ID:{row[0]} || Name:{row[1]} | Age:{row[2]} | Grade:{row[3]}\n")
Button(root,text="Show student data",command=show_data).grid(row=4,column=1)
text_area=Text(root,height=10,width=40)
text_area.grid(row=5,column=0,columnspan=4)
def delete_data():
    conn=sqlite3.connect("students.db")
    cursor=conn.cursor()
    cursor.execute("DELETE FROM student WHERE id=?",(entry_id.get(),))
    conn.commit()
    conn.close()
    label_msg.config(text="Student deleted successfully",fg="red")
Label(root,text="student id").grid(row=6,column=0)
entry_id=Entry(root)
entry_id.grid(row=6,column=1)
Button(root,text="delete student data ",command=delete_data).grid(row=6,column=2)
def update_student():
    conn = sqlite3.connect("students.db")
    cursor = conn.cursor()

    student_id = entry_update_id.get()
    new_name = entry_update_name.get()
    new_age = entry_update_age.get()
    new_grade = entry_update_grade.get()

    if not student_id:   # ID is mandatory
        label_msg.config(text="â ï¸ Please enter the Student ID to update!", fg="red")
        return

    # Update only the fields that are filled
    if new_name:
        cursor.execute("UPDATE student SET name=? WHERE id=?", (new_name, student_id))
    if new_age:
        cursor.execute("UPDATE student SET age=? WHERE id=?", (new_age, student_id))
    if new_grade:
        cursor.execute("UPDATE student SET grade=? WHERE id=?", (new_grade, student_id))

    conn.commit()
    conn.close()
    label_msg.config(text="â Student updated successfully!", fg="blue") 
Label(root,text='id').grid(row=8,column=0)
Label(root,text='Name').grid(row=9,column=0)   
Label(root,text='Age').grid(row=10,column=0)  
Label(root,text='Grade').grid(row=11,column=0)
entry_update_id = Entry(root, width=25) 
entry_update_name = Entry(root, width=25) 
entry_update_age = Entry(root, width=25) 
entry_update_grade = Entry(root, width=25)
entry_update_id.grid(row=8, column=1, padx=5, pady=5)
entry_update_name.grid(row=9, column=1, padx=5, pady=5)
entry_update_age.grid(row=10, column=1, padx=5, pady=5)
entry_update_grade.grid(row=11, column=1, padx=5, pady=5)
Button(root,text='update the data',command=update_student).grid(row=12,column=1)
entry_update_id.delete(0, END)
entry_update_name.delete(0, END)
entry_update_age.delete(0, END)
entry_update_grade.delete(0, END)
root.mainloop()