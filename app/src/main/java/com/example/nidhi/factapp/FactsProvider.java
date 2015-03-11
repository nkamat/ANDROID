package com.example.nidhi.factapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import java.util.Random;

/**
 * Created by Nidhi on 09/03/2015.
 */
public class FactsProvider extends ContentProvider {
    public static final int CATEGORY_SCIENCE = 1;
    public static final int CATEGORY_HISTORY = 2;
    public static final int CATEGORY_GEOGRAPHY = 3;
    public static final int CATEGORY_TECHNOLOGY = 4;
    public static final int CATEGORY_FOOD = 5;
    public static final int CATEGORY_ANIMAL = 6;

    private static final String[] factsScience = {
            "The largest ever hailstone weighed over 1kg",
            "Every year lightning kills over 1000 people",
            "It takes 8 minutes 17 seconds for light to travel from the Sun’s surface to the Earth",
            "Every year over one million earthquakes shake the Earth",
            "If you could drive your car straight up you would arrive in space in just over an hour",
            "The thermometer was invented in 1607 by Galileo",
            "In 5 billions years the Sun will run out of fuels and turn into a Red Giant",
            "There are 60, 000 miles of blood vessels in the human body",
            "It would take over an hour for a heavy object to sink 6.7 miles down to the deepest part of the ocean",
            "Light would take 0.13 seconds to travel around the Earth",
            "Every hour the Universe expands by a billion miles in all directions",
            "The risk of being struck by a falling meteorite for a human is one occurrence every 9, 300 years"
    };
    private static final String[] factsHistory = {
            "In medieval times people were put to death for being witches",
            "Ice age Britons used skulls of the dead as cups",
            "Animals were put on trial in medieval times and routinely sentenced to death",
            "Joseph Stalin is believed to have killed between 20-60 million people",
            "The introduction of Europeans to the New World saw the Native American population drop form an estimated 12 million in 1500 to barely 237, 000 in 1900",
            "In the 16th and 17th century wealthy Europeans ate corpses thinking they’d cure them of ailments",
            "In early Rome, a father could legally kill anyone in his family",
            "The shortest war was fought between Zanzibar and England in 1896. It lasted only 38 minutes before Zanzibar surrendered",
            "The first bomb dropped on Germany in World War II, killed the only elephant in the Berlin Zoo",
            "The flu killed over 20 million people in Spain from 1918 to 1919",
            "Julius Caesar wore a laurel wreath to cover the onset of baldness",
            "Ancient Egyptians used slabs of stones as pillows"
    };
    private static final String[] factsGeography = {
            "About 70% of the Earth’s surface is covered by oceans",
            "The largest ocean on Earth is the Pacific Ocean, covering around 30% of the Earth’s surface",
            "We have only explored about 5% of the world’s oceans!",
            "About two-thirds of Africa is in the Northern Hemisphere",
            "About 90% of the world’s population lives in the Northern Hemisphere",
            "France is about 30% larger than the state of California",
            "The structure of Japan has more than 3, 900 islands",
            "The Ganges Delta has the largest of all the rivers",
            "The first capital of the Russian state was Ladoga",
            "There are 17 active volcanoes in Japan",
            "February 18, 1979 it was snowing in the Sahara Desert",
            "There are no rivers in Saudi Arabia"
    };
    private static final String[] factsTechnology = {
            "Over 4 billions people own a mobile phone",
            "The first computer mouse was made of wood",
            "On an average work day, a typist’s fingers travel 12.6 miles",
            "There are approx 1.06 billion instant messaging accounts worldwide",
            "Two-thirds of American Internet users shop online",
            "220 million tons of old computers and other technology hardware are trashed in the United States each year",
            "Emoticons were reportedly used for the first time in 1982 when a computer scientist created a happy face with a colon, a hyphen and parentheses",
            "Bluetooth was name for a Danish king who united disparate territories",
            "In 1910, Nathaniel Baldwin invented headphones in the kitchen of his Utah home"
    };
    private static final String[] factsFood = {
            "Oklahoma’s state vegetable is the watermelon",
            "One of the most popular pizza toppings in Brazil is green peas",
            "Apples belong to the rose family, as do pears and plums",
            "About 70% of olive oil being sold is not actually pure olive oil",
            "Chocolate was once used as currency",
            "The tea bag was created by accident, as tea bags were originally sent as samples",
            "Humans are born craving sugar",
            "Coconut water can be used as blood plasma",
            "McDonald’s sells 75 hamburgers every second of the day",
            "Ketchup was used as a medicine in the 1800s to treat diarrhoea, among other things",
            "Eating bananas can help fight depression",
            "Peanuts aren’t nuts, they’re legumes"
    };
    private static final String[] factsAnimal = {
            "Camels have three eyelids to protect themselves from blowing sand",
            "A female ferret will die if it goes into heat and cannot find a mate",
            "Sea otters hold hands when they sleep to keep them from drifting apart",
            "Squirrels plant thousands of new trees each year simply by forgetting where they put their acorns",
            "When playing with female puppies, male puppies will often let them win, even if they have a physical advantage",
            "Cows have best friends",
            "Gentoo penguins propose to their life mates with a pebble",
            "In China, killing a Panda is punishable by death",
            "Rats laugh when tickled",
            "Dolphins have names for each other",
            "Puffins mate for life",
            "Before chicks hatch, they can communicate with each other and their mother through a system of sounds"
    };

    private static Random randomGenerator = new Random();

    private static String getCategoryFact(String[] facts) {
        int index = randomGenerator.nextInt(facts.length);
        return facts[index];
    }

    public static String getFact(int category) {
        switch (category) {
            case CATEGORY_SCIENCE:
                return getCategoryFact(factsScience);

            case CATEGORY_HISTORY:
                return getCategoryFact(factsHistory);

            case CATEGORY_GEOGRAPHY:
                return getCategoryFact(factsGeography);

            case CATEGORY_TECHNOLOGY:
                return getCategoryFact(factsTechnology);

            case CATEGORY_FOOD:
                return getCategoryFact(factsFood);

            case CATEGORY_ANIMAL:
                return getCategoryFact(factsAnimal);

            default:
                return "";
        }
    }

    public static String getCategoryName(int category) {
        switch (category) {
            case CATEGORY_SCIENCE:
                return "SCIENCE";

            case CATEGORY_HISTORY:
                return "HISTORY";

            case CATEGORY_GEOGRAPHY:
                return "GEOGRAPHY";

            case CATEGORY_TECHNOLOGY:
                return "TECHNOLOGY";

            case CATEGORY_FOOD:
                return "FOOD";

            case CATEGORY_ANIMAL:
                return "ANIMAL";

            default:
                return "";
        }
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}