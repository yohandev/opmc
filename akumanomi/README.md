<div align="center">
    <h1><code>Akuma no Mi</code></h1>
    <p><strong>a Minecraft devil fruits mod for Fabric</strong></p>
</div>

### Fruit Mechanics
- Discover `Fruited Leaves` block on naturally spawning trees, which have
  the chance to drop a vanilla `Apple` or `Devil Fruit` consumable item.
- Consuming said `Devil Fruit` grants the user a set of powers and revokes
  their ability to swim.
- `Devil Fruit` items and abilities are unique in each world, and get
  reincarnated to a `Fruited Leaves` block within a 100 block radius
  once their user dies.
- Using `Devil Fruit` abilities is a 3-click combo, beginning with a
  right(`R`) click. ie. `R`-`L`-`L`
- All `Devil Fruit` buffs and abilities don't work when fully submerged
  by water
- Ocean monuments' treasure now feature `Sea Prism Stone` which, when
  combined with any tool in an anvil, grants an enchantment that renders
  that weapon especially effective against `Devil Fruit` users.
  
### Haki Mechanics
- Every player is granted 3 lives on "canon" respawn
    - *Not* keep-inventory, but keeps `Devil Fruit` abilities and `Haki`
    levels(more on to follow)
- `Haki` is an innate power that awakens with time and achievements. There
  are three types:
    - `Kenbunshoku Haki` *(Observation Haki)*
        - Passive: Small chance to dodge incoming damage.
        - Ability(`shift` + `R`-`L`-`R`): For the price of 2-3 hunger bars,
          give every entity in a radius the glowing effect, to essentially
          "feel" their presence.
    - `Busoshoku Haki` *(Armament Haki)*
        - Passive: Small amount of protection and thorns.
        - Ability(`shift` + `R`-`L`-`L`): For the price of 1 hunger bar,
          grants its user strength and a means to damage `Logia Devil Fruit`
          users(more on this later) for the next hit.
    - `Haoshoku Haki` *(Conqueror's Haki)*
        - Passive: Entities in a radius considered "unworthy" get "knocked
          out," obtaining slowness and blindness.
        - Ability(`shift` + `R`-`R`-`L`): All entities in a radius get
          slowness and blindness, and those "unworthy" straight up die.
          Consumes 7 hunger bars and only works on 3.0 or less hearts.
- `Haki` abilities are associated to a single level, and unlock once that
  number passes a certain threshold. Thus, a player doesn't know which
  `Haki` they have until a bit of leveling up.
- A player is granted anywhere from none to all three types of `Haki` on
  "canon spawn"
    - Due to the `Haki` level mechanic, there won't be any suicide cycles
    to obtain all three types.
      
### Fruits
#### `Mera Mera no Mi`(*Flare-Flare Fruit*)
- Passive: Immunity to normal fire, but *not* lava. All punches deal a small
  duration of fire damage.
- Logia Form(On/Off, `R`-`R`-`R`): Become fire, where nothing can touch the
  user. Weak to hotter elements(Lava), `Armament Haki`, and `Sea Prism
  Stone` coated weapons. Consumes hunger over time while activated.
- Fire Fist(Empty hand + `R`-`L`-`L`): Throws a punch that sets whatever is
  hit ablaze, and causes an explosion that sets a small radius on fire.
  Consumes 2 hunger.
- Blaze Net(`R`-`L`-`R`): Creates a ring of fire around the user. Consumes
  3 hunger.
- Fireflies(`R`-`R`-`L`): Summons a dozen "fireflies"(red XP entities with
  a large follow radius) that sets whatever is hit on fire. Consumes 4
  hunger.
#### `Magu Magu no Mi` (*Magma-Magma Fruit*)
- Passive: Immunity to normal fire, lava, and magma block damage. It has
  a lot of parallels with the `Flare-Flare Fruit`, only lava burns other
  than fire and is thus naturally superior.
- Logia Form(On/Off, `R`-`R`-`R`): Become magma, where nothing can touch
  the user. Weak to `Armament Haki` and `Sea Prism Stone` coated weapons.
  Consumes hunger over time while activated.
- Great Eruption(Empty hand + `R`-`L`-`L`): Throws a punch that sets
  whatever is hit ablaze, causing an explosion and creating a 2x2 area of
  (temporary) flowing lava. Consumes 3 hunger.
- Dog Biting Crimson Lotus(`R`-`L`-`R`): Summons a single fireball in the
  direction the user is facing. Consumes 3 hunger.
- Meteor Volcano(`R`-`R`-`L`): Summons a volley of fireballs, from the sky,
  to wherever the user is looking(loose reach distance restrictions).
  Consumes 7 hunger.
#### `Goro Goro no Mi` (*Rumble-Rumble Fruit*)
- Passive: Immunity to lighting damage.
- Logia Form(On/Off, `R`-`R`-`R`): Become lightning, where nothing can touch
  the user. Weak to `Armament Haki` and `Sea Prism Stone` coated weapons.
  Consumes hunger over time while activated.
- 20-200 Million Volts Vari(`R`-`L`-`L`): Summons lighting at
  the entity punched, with varying amounts of damage depending on the
  random voltage. Consumes 3 hunger.
- Thunder Metallurgy(`R`-`L`-`R`): If holding a gold ingot, transforms that
  ingot into a golden trident and throws it in the direction the user is
  looking. Otherwise, teleports to wherever the user is looking as long as
  the block is conductive(metals, ores). Consumes 2 hunger.
- El Thor(`R`-`R`-`L`): Summons a large amount of lightning in the area
  wherever the user is looking(loose reach distance restrictions). Consumes
  6 hunger.
#### `Hie Hie no Mi` (*Ice-Ice Fruit*)
- Logia Form(On/Off, `R`-`R`-`R`): Become ice, and shatter before anything
  can touch the user. Also grants the frost-walker effect. Weak to
  `Armament Haki` and `Sea Prism Stone` coated weapons. Consumes hunger
  over time while activated.
- Ice Time(`R`-`L`-`L`): Entity hit is covered in ice and rendered immobile
  with slowness and mining fatigue for a few seconds. Consumes 3 hunger.
- Ice Block: Partisan(`R`-`L`-`R`): Creates and shoots 4 ice tridents in
  the direction the user is facing. Consumes 3 hunger.
- Ice Age(`R`-`R`-`L`): Performs a flood-fill over water blocks, starting
  at the user, turning everything to temporary ice lasting 1 in-game day.
  Consumes 9 hunger.
#### `Suna Suna no Mi` (*Sand-Sand Fruit*)
- Logia Form(On/Off, `R`-`R`-`R`): Become sand, where nothing can touch
  the user. Disabled for a few seconds if in contact with water, or hit
  with a splash potion of any kind(water included). Weak to `Armament
  Haki` and `Sea Prism Stone` coated weapons. Consumes hunger over time
  while activated.
- Abilities TBD
#### `Bari Bari no Mi` (*Barrier-Barrier Fruit*)
- Barrier(`R`-`L`-`Hold R`): Creates a temporary rectangular(supporting
  diagonals) wall of unbreakable, impenetrable barrier blocks as long as
  the last `R`is held. Deals a small amount of thorns when attacked.
  Consumes hunger over time while activated.
- Barrier Ball(`R`-`R`-`Hold R`): Creates a temporary spherical shell
  of unbreakable, impenetrable barrier blocks as long as the last `R` is
  held. Deals a small amount of thorns when attacked. Consumes hunger over
  time while activated.
- Barri-Barri Pistol(`R`-`L`-`L`): Forms a small barrier around the user's
  fist and throws a punch that deals more damage than normal.
- Barrier Crash(`R`-`R`-`R`): Creates a rectangular(supporting diagonals)
  wall of moving barrier blocks, that move a few blocks in the direction
  the user is facing and push all movable entities dealing damage.
#### `Ope Ope no Mi` (*Op-Op Fruit*)
- Room(On/Off, `R`-`R`-`R`): Creates a spherical space of medium-long range
  with the user at the epicenter(stays fixed after creation) where all the
  following abilities work. Consumes 2 hunger on enable, then consumes
  hunger over time.
- Shambles(`R`-`L`-`Hold R`): Selects two entities, the first being what
  the user is looking at during the first `R`, the second being what the
  user is looking at after releasing the last `Hold R`, and swaps their
  position as long as both are in the "room." Costs 0 hunger.
- Self-Shambles(`R`-`L`-`L`): Teleports the user to wherever they're
  looking, as long as that location is inside the "room." Costs 0 hunger.
- Takt(`R`-`R`-`Hold L`): Selects whatever entity or block the user is first
  looking at, then levitates it to follow the user's cursor like
  telekinesis. Area of effect is the "room," and costs 0 hunger.
#### `Gura Gura no Mi` (*Tremor-Tremor Fruit*)
- Helmet Splitter(Empty hand + `R`-`L`-`L`): Supercharges a punch using
  shock waves, dealing much more damage than a normal punch while doing
  extra durability damage to the piece or armor hit. Consumes 1.5 hunger.
- Earthquake(`R`-`R`-`R`): Creates a shockwave originating from the user,
  extending to a certain radius. Entities in contact with the ground when
  the shockwave passes them are heavily damaged, and all blocks up to a
  certain depth are made into falling blocks(like sand or gravel, but 
  maintaining their type of course). Consumes 4 hunger.
- Abilities TBD
#### `Horu Horu no Mi` (*Horm-Horm Fruit*)
- Healing Hormone(`R`-`R`-`R`): Grants healing and absorption effects to
  the entity clicked, or the user if none is under their cursor. Consumes
  3 hunger.
- Tension Hormone(`R`-`L`-`R`): Grants strength and speed effects to the
  entity clicked, or the user if none is under their cursor. Affected
  entity loses 2 health, and consumes 2 hunger.
- Other abilities TBD
#### `Bane Bane no Mi` (*Spring-Spring Fruit*)
- Spring Snipe(`R`-`R`-`L`): Launches the user in the direction they are
  facing, damaging all entities in the way. Consumes 2 hunger.
- Spring Death Knock(`R`-`L`-`Hold L`): Charges up a punch while the last
  `Hold L` is held, a throws a punch that deals damage proportional to the
  time held. Consumes 0.5 hunger.
- Spring Hopper(`R`-`R`-`Hold R`): Launches the user in the direction they
  are looking with great force, continuing to bounce on surfaces landed on
  as long as the last `Hold R` is held, accumulating kinetic energy. When
  the `Hold R` is released, all that energy is released in a single leap
  forward where any entity in the path is damaged. Consumes 1 hunger per
  jump.