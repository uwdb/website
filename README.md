# Myria Website

Website for the DB group.
This Website based on html and some anither language.
See the site in action at [db.cs.washington.edu](http://db.cs.washington.edu/).

Write your recent news into the news data file [`_data/news.yml`](_data/news.yml).

## How to make changes

* install [jekyll](http://jekyllrb.com/)
* run jekyll `jekyll serve --watch --baseurl ''` (shorthand: `./serve.sh`)
* head over to [localhost:4000](http://127.0.0.1:4000)

If jekyll throws a version error, you may need to `gem install json` before serving.

## How to add slides for NWDS
* SSH to recycle or another CSE machine
* cd to /cse/www2/db/db2-files/nwds/pdf
* Upload pdf version of slides
* Add the correct link on the NWDS markdown page
