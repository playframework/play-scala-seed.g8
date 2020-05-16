# play-scala-seed.g8

[![Build Status](https://travis-ci.com/cameronhotchkies/semisafe-play.g8.svg?branch=2.8.x)](https://travis-ci.com/cameronhotchkies/semisafe-play.g8)

Giter8 template for generating an opinionated Play project seed in Scala, as
recommended by semisafe.com. This was forked from the default [Play template][0]

This project is intended for people who know how to use Play and want to get
started right away.

You should only need to clone this project if you are modifying the giter8
template.  For information on giter8 templates, please see
<http://www.foundweekends.org/giter8/>

## Running

If you want to create a project:

```bash
sbt new cameronhotchkies/semisafe-play.g8
```

## Scaffolding

Type `g8Scaffold form` from sbt to create the scaffold controller, template and
tests needed to process a form.

You can also create your own giter8 seeds and scaffolds based off this one by
forking from the <https://github.com/cameronhotchkies/semisafe-play.g8> github
project.

## Running locally

If you are testing this giter8 template locally, you should
[install g8](http://www.foundweekends.org/giter8/setup.html) and then run the
[local test](http://www.foundweekends.org/giter8/testing.html) feature:

```bash
g8 file://semisafe-play.g8/ --name=my-seed-test --force
```

Will create an example template called `my-seed-test`, for example.

[0]: https://github.com/playframework/play-scala-seed.g8
[1]: https://github.com/cameronhotchkies/semisafe-play.g8
