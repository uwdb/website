# UWDB Website

Website for the UWDB group.
See the site in action at [db.cs.washington.edu](http://db.cs.washington.edu/).

Write your recent news into the news data file [`_data/news.yml`](_data/news.yml).

## Accessibility Guidelines

When creating or editing pages, follow these guidelines to ensure WCAG 2.1 AA compliance:

### Images
- ✅ **Always add descriptive alt text** to images: `<img src="logo.png" alt="Project Name Logo">`
- ❌ Avoid generic alt text like "image", "photo", or "logo"
- For decorative images, use empty alt: `alt=""`

### Headings
- ✅ **Use proper heading hierarchy**: h1 → h2 → h3 (don't skip levels)
- ❌ Don't use headings just to make text big/bold (use CSS classes like `.lead` instead)
- ❌ Don't skip heading levels (e.g., h2 → h4)
- Each page should have one h1
- Headings define document structure for screen readers

### Links
- ✅ **Make link text descriptive**: "Read the research paper" not "click here"
- ✅ **Add visual indicators for PDFs**: Links to `.pdf` files automatically show "(PDF)"
- ✅ Use `title` or `aria-label` for icon-only links

### Colors
- ✅ **Ensure 4.5:1 contrast ratio** for normal text, 3:1 for large text
- Test with [WebAIM Contrast Checker](https://webaim.org/resources/contrastchecker/)
- Use `#333` or darker for text on light backgrounds

### Icons
- ✅ **Hide decorative icons from screen readers**: `<i class="fa fa-icon" aria-hidden="true"></i>`
- ✅ Always include visible text alongside icons

### Forms (if applicable)
- ✅ **Associate labels with inputs**: `<label for="email">Email</label><input id="email">`

### Testing
Run [WAVE browser extension](https://wave.webaim.org/extension/) before committing changes.

See [ACCESSIBILITY.md](ACCESSIBILITY.md) for complete details.

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
