# Potion-Imperium
Genre: RPG (Role-Playing Game), Social Simulation, Crafting, Shop Management

## Setting:

World: A post-apocalyptic Earth where mythical creatures coexist with remnants of human civilization. Players are potion merchants navigating this dangerous, yet magical, environment.
Environment: Diverse biomes (forests, swamps, deserts, mountains) with different ingredients, creatures, and challenges.

## Core Gameplay Mechanics:
### Character Creation: 
Players create a character with customizable traits (e.g., alchemical knowledge, charisma, bargaining skills).
Each trait impacts gameplay, such as improving potion effectiveness, increasing ingredient yield, or boosting sales.

### Foraging:
Players explore various biomes to collect ingredients. The available ingredients vary by biome and time.
AI Component: The AI determines what ingredients the player finds based on the environment, time, and random events (e.g., weather changes, creature encounters).

### Potion Crafting:
Players use their collected ingredients to craft potions.
AI Component: The AI generates potion effects based on the combination of ingredients, introducing variability and allowing for unique potion discovery.
Players can experiment with new combinations to discover previously unknown potions.

### Experimentation:
Players can combine ingredients in unknown ways to discover new potions.
AI Component: The AI evaluates the results, which could lead to the discovery of a new recipe, a failed potion, or even unexpected side effects.

### Shop Management:
Players sell potions to adventurers, townsfolk, and mythical creatures.
AI Component: The AI simulates customer behavior, determining what types of potions they need, their negotiation tactics, and how they respond to pricing and availability.
Players can upgrade their shop, expand their product line, and even set up multiple stores.

### Social Interaction:
Players can interact with NPCs and other players, forming alliances, trading, or even competing.
AI Component: The AI handles NPC interactions, making them feel more dynamic and responsive to player actions.

## AI-Driven Features:
###  Ingredient Discovery:
The AI determines which ingredients are found during foraging, taking into account the environment, player's level, and random events. This could be made more complex by introducing seasons or events that alter ingredient availability.

### Potion Effects and Recipes:
Instead of pre-programmed outcomes, the AI generates potion effects based on the ingredients used. This system could allow for an infinite number of potion combinations and effects, making each player’s experience unique.

### Dynamic Economy:
The in-game economy could be driven by AI, responding to supply and demand across the player base. For example, if many players are selling a specific potion, its value might decrease. This creates a living, evolving marketplace.

### NPC Interaction:
The AI could generate customer personalities and needs, leading to varied and unpredictable interactions. Some customers might haggle, others might prefer certain types of potions, and some might even offer quests in exchange for rare potions.

## Simulation Feature
### Coordinates System: 
Every element (e.g., characters, objects, locations) in the game world is represented with a coordinate system, allowing precise placement and interaction.

### Map Grid: 
The world is divided into a grid system where each cell represents a specific geographic or fictional area. This helps manage the vastness of the world and facilitates efficient location-based queries.

### Real and Fictional Objects: 
Both real-world elements (like mountains and rivers) and fictional elements (like goblin encampments and vampire nests) are placed and managed based on coordinates.

### Object Creation and Destruction: 
Objects can be created or removed based on player actions or environmental changes. For example, discovering a new vampire nest or an adventure successfully eliminating one.

### Weather and Seasons: 
Environmental conditions can influence gameplay and object behavior. For instance, certain creatures or resources might only be available during specific seasons or weather conditions.

### Player Activity Impact: 
Actions like foraging or adventuring can trigger events that affect the world. A player discovering a vampire nest or mining resources could lead to environmental changes or spawn new elements.

### Discovery of New Objects: 
When a player forages or explores, there is a chance they might discover new objects (e.g., a hidden goblin lair). These discoveries are stored in the database with coordinates.

### Object Interaction: 
Other players who enter the same coordinates can encounter the newly discovered objects. This interaction could lead to events like battles, resource gathering, or further exploration.