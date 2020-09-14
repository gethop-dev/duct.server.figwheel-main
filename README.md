# Hydrogen server.figwheel-main

[Integrant][] methods for compiling and dynamically reloading
ClojureScript files in the [Duct][] framework using [Figwheel Main][].
Figwheel is designed to be used during development. For compiling
ClojureScript for a production release, use [compiler.cljs][].

### NOTE!

This library is heavily inspired by [Duct server.figwheel][]. In fact, we're going to make an effort to make it *canon*
to Duct's creator vision of this entire framework.

[integrant]:     https://github.com/weavejester/integrant
[duct]:          https://github.com/duct-framework/duct
[Figwheel Main]: https://figwheel.org/
[compiler.cljs]: https://github.com/duct-framework/compiler.cljs
[Duct server.figwheel]: https://github.com/duct-framework/server.figwheel

## Installation

To install, add the following to your project `:dependencies`:

    [hydrogen/server.figwheel-main "0.1.0"]

## Usage

This library provides the `:duct.server/figwheel-main` key, and accepts the
same options as Figwheel Main.

```edn
{:duct.server/figwheel-main
 {:id "dev"
  :options {:main 'foo.bar.client
            :output-to "target/resources/foo/bar/public/js/main.js"
            :output-dir "target/resources/foo/bar/public/js"
            :asset-path "/js"
            :optimizations :none}
  :config {:mode :serve
           :open-url false
           :css-dirs ["resources"]}}}
```

See the [Figwheel Main documentation][] for more information.

[Figwheel Main documentation]: https://figwheel.org/docs/

## License

Copyright © 2020 Magnet S Coop.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
