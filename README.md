# NOTE This is still a draft!

# Hydrogen server.figwheel-main

[Integrant][] methods for compiling and dynamically reloading
ClojureScript files in the [Duct][] framework using [Figwheel Main][].
Figwheel is designed to be used during development. For compiling
ClojureScript for a production release, use [compiler.cljs][].

[integrant]:     https://github.com/weavejester/integrant
[duct]:          https://github.com/duct-framework/duct
[Figwheel Main]: https://figwheel.org/
[compiler.cljs]: https://github.com/duct-framework/compiler.cljs

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
