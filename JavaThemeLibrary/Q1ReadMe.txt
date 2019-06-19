How to create a new theme:
I made sure it's easy to apply a new theme. I created all needed components (Cool303ButtonTheme, Cool303WindowTheme, Cool303RootTheme, Cool303BoxTheme) follow the green comments inside that will guide you whenever you should add your colour or size of choice. Once it's done, run Application.java and type "theme" in the console.

In my question 1 I used following design patterns:
MVC (model view controller): here in my program the Cool303 objects, namely Cool303Button, Cool303Box, Cool303Root, Cool303Window function as models by directly changing and managing components of the User Interface. My application doubles as both View and Controller: it evokes GUI displaying all the components (view), it also takes an input that is passed to the model and then displayed in a view acting as a mediator between the models and the view.

Composite pattern: my Cool303Root contains all my boxes and buttons hence "composing" the GUI. The modifications that are done to Cool303Root modify its individual components as well.

Decorator pattern: as example my Cool303RootPastel and my Cool303RootSummer extend Cool303Root and add some functionality by wrapping the components of the Cool303Root with summer and pastel themes. The same applies to Cool303Button, Cool303Box and Cool303Window. Also my whole package decorates the certain components of the swing library.

As for my OO techniques I used Inheritance in extending JPanel, Jbutton and Modularization by creating separate objects.