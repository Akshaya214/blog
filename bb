from flask import Flask,render_template
from utils.db import db
flask_app=Flask(__name__)

flask_app.config['SQLALCHEMY_DATABASE_URI']=='sqllite:///blog'

db.init_app(flask_app)

def index():
    return render_template('index.html')
@flask_app.route('/about')
def about():
    return render_template('about.html')

@flask_app.route('/blog')
def blog():
    blog_list=[
        {
            "blog_id":1,
            "blog_title":"blog one",
            "blog_content":"blog dummy content",
            "author":"Author 1",
            "date":"28/11/2024"
        },
        {
            "blog_id": 2,
            "blog_title": "blog one",
            "blog_content": "blog dummy content",
            "author": "Author 1",
            "date": "28/11/2024"
        },
        {
            "blog_id": 3,
            "blog_title": "blog one",
            "blog_content": "blog dummy content",
            "author": "Author 1",
            "date": "28/11/2024"
        },
        {
            "blog_id": 4,
            "blog_title": "blog one",
            "blog_content": "blog dummy content",
            "author": "Author 1",
            "date": "28/11/2024"
        },
        {
            "blog_id": 5,
            "blog_title": "blog one",
            "blog_content": "blog dummy content",
            "author": "Author 1",
            "date": "28/11/2024"
        },
        {
            "blog_id": 6,
            "blog_title": "blog one",
            "blog_content": "blog dummy content",
            "author": "Author 1",
            "date": "28/11/2024"
        },

    ]
    print(blog_list)

    return render_template(template_name_or_list='blog.html',blog=blog_list)

@flask_app.route('/add_blog')
def add_blog():
    return render_template('add_blog.html')










if __name__=='__main__':
    flask_app.run(
        host='127.0.0.1',
        port=8005,
        debug=True
    )













from utils.db import db

"blog_id":1,
"blog_title":"blog one",
"blog_content":"blog dummy content",
"author":"Author 1",
"date":"28/11/2024"

class Blog(db.Model):
    blog_id=db.Column(db.Integer,primary_key=True)
    blog_title=db.Column(db.String(50),nullable=False)
    blog_content=db.Column(db.String(1000),nullable=False)
    author=db.Column(db.String(100),nullable=False)
    date=db.Column(db.String(50),nullable=False)















from flask_sqlalchemy import SQLAlchemy


db=SQLAlchemy()













{%extends 'base.html' %}

{% block title %}add_blog page{% endblock %}

 {% block content %}
<h1>Hello!! I am from add_blog page</h1>

{% endblock %}


















{%extends 'base.html' %}

{% block title %}index page{% endblock %}

 {% block content %}
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>
<div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">Card title</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="card-link">Card link</a>
    <a href="#" class="card-link">Another link</a>
  </div>
</div>


{% endblock %}














<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>{% block title %}Blog App{% endblock %}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Blog App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="/">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="/about">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="/blog">Blog</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="/add_blog">Add_Blog</a>
        </li>
    </div>
  </div>
</nav>
 {% block content %} {% endblock %}
















    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
