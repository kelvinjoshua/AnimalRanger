## Project name
* Animal-Ranger
## Author
* Kelvin Joshua Bale

## Project description.
* Africa is home to some of the world's most endangered species,
  including the mountain gorilla, Grevy’s zebra, and Ethiopian wolf.
  To protect populations from further decline, our on-the-ground safeguards involve training rangers.
 
  * For this application the user(ranger), keys in their details that are saved as well as animal findings.
  * live link:
    https://wildlifetracking.herokuapp.com/

## Setup requirements
* Clone this respository locally,to allow us to view our database.
 *  Add animal and ranger details ,from our application.
* View entries made by running the following commands in terminal:
  ## local  database setup.
*  Navigate to Models/DB .
  * Uncomment localhost with your  Machine's  Postgres user & Password credentials.
   * Comment out any code with usage of  "connectionstring".
* In terminal, run psql - Connect to postgres Database.
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker  - connect to our local database.
  * CREATE TABLE animals (id integer, name VARCHAR,type VARCHAR,health VARCHAR, age VARCHAR);
   * CREATE TABLE sightings (ranger VARCHAR, location VARCHAR,animal_id integer);
  
* SELECT * FROM animals;  -  View all animal entries.
* SELECT * FROM sightings;  - View all ranger  entries.
* \q - disconnect from database
## Sample
![sample](https://user-images.githubusercontent.com/60692205/110475915-7a771e80-80f2-11eb-8e23-c2dc230d2fc6.jpg)

## Technologies used
* Spark web-framework.
* Handle bars-templates.
* Heroku for deployment.
* PostGres database.
* Bootstrap && Css.

## MIT License
copyright (c) 2021 kelvinjoshua

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.