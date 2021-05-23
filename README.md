# amon-sul-Release-1
###_Version 3 of the WeatherTop veiwing app_

## New Features:

- [x] New **Input** for Wind on the Station Summary cards:
    - [x] Wind Direction, in whole numbers 0-360 degrees.
    

- [x] New **Outpus** on the Station Summary cards:
    - [x] Wind Compass (direction in words, i.e. "North")
    - [x] Wind Chill factor (in degrees Celcius).


- [x] New **Features**:
    - [x] Add a new Station to the Dashboard.
    - [x] Add a new Reading to an existing Station.


- [x] **Current Weather Icons**:
    -[x] Context Sensitive


- [x] **Maximum and Minimum** Readings for:
    - [x] Temperature
    - [x] Wind Speed
    - [x] Pressure

## Description:

In this version the user can add a new Station to their Dashboard, providing
it with a name as they do so.

The user can also now created new Readings inside of each Station.

A new wind direction **Input** is required for a Reading, and this must be
submitted as whole numbers 0-360 degrees.

On the Station Summary/Latest Weather cards, new **Outputs** have been
added to show the direction that the wind wass blowing in the latest 
Reading for that Station (shown in words, i.e. "South South West"),
and to show the current "feels like" wind chill factor.

##Known Issues:

Currently a User can create any number of Stations with the same name. 
* To be fixed in subsequent releases.

## How to Run:

Download the repository from GitHub:

* [Amon Sul Release 1 (Version 3)](https://github.com/diarmuidoriordan/amon-sul-Release-1)

_(Make sure you have [Play 1.5.3](https://www.playframework.com/releases) installed on your computer.)_

Navigate to the Project folder in _**Terminal**_ or the _**Command Prompt**_, and run the following commands:

* ```play idealize```

* ```play run```

In your browser, enter ```localhost:9000``` in the URL search bar.
Press the return key on your keyboard to view the project.
