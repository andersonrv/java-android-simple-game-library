package android.example.e_games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars

    private ArrayList<String> mGameTitles = new ArrayList<>();
    private ArrayList<String> mGamePics = new ArrayList<>();
    private ArrayList<String> mGameGenres = new ArrayList<>();
    private ArrayList<String> mGameDescriptions = new ArrayList<>();
    private ArrayList<String> mGameLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Following initialization on debugger
        Log.d(TAG, "onCreate: started.");

        loadGameLibrary();
    }


    // Adding a info icon to Action Bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    private void loadGameLibrary() {
        Log.d(TAG, "initLibrary: getting images from urls.");
        mGamePics.add("https://images.gog.com/ccf2e9793f05729e240e5416a7df9b27fbea578c98f4acabb3f8082a9501c859_product_card_v2_logo_480x285.png");
        mGameTitles.add("The Witcher 3: Wild Hunt - Game of the Year Edition");
        mGameGenres.add("Role-playing - Adventure - Fantasy");
        mGameDescriptions.add("Become a professional monster slayer and embark on an adventure of epic proportions! Upon its release, The Witcher 3: Wild Hunt became an instant classic, claiming over 250 Game of the Year awards. Now you can enjoy this huge, over 100-hour long, open-world adventure along with both its story-driven expansions worth an extra 50 hours of gameplay. This edition includes all additional content - new weapons, armor, companion outfits, new game mode and side quests.");
        mGameLinks.add("https://www.gog.com/game/the_witcher_3_wild_hunt_game_of_the_year_edition");

        mGamePics.add("https://images.gog.com/8d8da159e807143303f291de1af58d3489d797fd4b888dabf7cb3d77fbc95327_product_card_v2_logo_480x285.png");
        mGameTitles.add("Thronebreaker: The Witcher Tales");
        mGameGenres.add("Role-playing - Strategy - Fantasy");
        mGameDescriptions.add("Thronebreaker is a single player role-playing game set in the world of The Witcher that combines narrative-driven exploration with unique puzzles and card battle mechanics.\n" +
                "Crafted by the developers responsible for some of the most iconic moments in The Witcher 3: Wild Hunt, the game spins a truly regal tale of Meve, a war-veteran queen of two Northern Realms — Lyria and Rivia. Facing an imminent Nilfgaardian invasion, Meve is forced to once again enter the warpath, and set out on a dark journey of destruction and revenge.");
        mGameLinks.add("https://www.gog.com/game/thronebreaker_the_witcher_tales");

        mGamePics.add("https://images.gog.com/d2b9bcd71f800ad64c3705aa675b269cad3fd8647c273305b22aa73851eeec97_product_card_v2_logo_480x285.png");
        mGameTitles.add("Dragon Age™: Origins - Ultimate Edition");
        mGameGenres.add("Role-playing - Adventure - Fantasy");
        mGameDescriptions.add("Dragon Age™: Origins\n" +
                "You are a Grey Warden, one of the last of this legendary order of guardians. With the return of mankind's ancient foe and the kingdom engulfed in civil war, you have been chosen by fate to unite the shattered lands and slay the archdemon once and for all. Explore a stunning world, make complex moral choices, and engage in bone-crushing combat against massive and terrifying creatures. \n" +
                "\n" +
                "Determine your legacy and fight for Thedas as a noble dwarf, an elf far from home, a mage apprentice, or a customized hero of your own design. Experience many unique origin stories on your quest to unite the kingdoms and defeat an ancient evil. \n" +
                "\n" +
                "Awakening Expansion Pack\n" +
                "Become the commander of the Grey Wardens and embark on a new campaign in the world of Amaranthine. You'll fight new enemies, learn new spells, and fend off the advancing Darkspawn forces. \n" +
                "\n" +
                "Nine Content Packs\n" +
                "The Stone Prisoner, Warden's Keep, Return to Ostagar, Feastday Gifts, Lailana's Song, The Darkspawn Chronicles, The Golems of Amgarrak, Witch Hunt, and the Blood Dragon Armor.\n" +
                "Determine your origin: customize your hero's physical appearance and character alignment, but choose wisely. Your race and combat class will define your origin, both within Thedas and beyond. Choices determine where you begin your journey and future interactions.\n" +
                "Build loyalty: recruit over a half-dozen party members, including mages, deadly assassins, a berzerker dwarf, and a warrior from the giant Qunari race. With so many different personalities, you'll have to watch your words to build trust, loyalty, and maybe even romance.\n" +
                "Make every move count: combine your own moves with those of your teammates to build a melee attack. Fight in real-time with hard-hitting strikes, or assign individual orders to teammates for a more tactical approach.");
        mGameLinks.add("https://www.gog.com/game/dragon_age_origins");

        mGamePics.add("https://images.gog.com/d4ea13082fab61ae0fbc1be0853e516a368fbffc5ef8fc4d8918392dd636b49a_product_card_v2_logo_480x285.png");
        mGameTitles.add("Elder Scrolls IV: Oblivion - Game of the Year Edition Deluxe, The");
        mGameGenres.add("Role-playing - Adventure - Fantasy");
        mGameDescriptions.add("When you buy this game, The Elder Scrolls: Arena and The Elder Scrolls Chapter II: Daggerfall will be added to your GOG.com account for free!\n" +
                "\n" +
                "The following content is included in the The Elder Scrolls IV: Oblivion® Game of the Year Edition Deluxe\n" +
                "Fighter's Stronghold Expansion\n" +
                "Live the life of a noble warrior in this expansive castle with private quarters, grand dining hall, and a wine cellar.\n" +
                "Knights of the Nine Quest\n" +
                "Vanquish the evil that has been released upon the land. New dungeons, characters, quests, and mysteries await.\n" +
                "Shivering Isles\n" +
                "See a world created in Sheogorath's own image, one divided between Mania and Dementia and unlike anything you've experienced in Oblivion.\n" +
                "Spell Tome Treasures\n" +
                "Get these books and find low and high-level spells, as well as new powerful spells with multiple effects added.\n" +
                "Vile Lair\n" +
                "An underwater multilevel hideout for evil players to find refuge, providing your character with safe haven.\n" +
                "Mehrune's Razor\n" +
                "Conquer one of the deepest and most challenging dungeons in all of Cyrodiil to claim this fearsome weapon.\n" +
                "The Thieves Den\n" +
                "Uncover a famous pirate's lost ship and claim it for your own. Designed for stealth-based characters.\n" +
                "Wizard's Tower\n" +
                "In the frozen mountains of Cyrodiil stands Frostcrag Spire, a tower of wonders for your magic-oriented character.\n" +
                "Orrery\n" +
                "Harness the power of the stars. Rebuild the Orrery to unlock the secrets of this Mages Guild Inner Sanctum.\n" +
                "Horse Armor Pack\n" +
                "Tamriel is a dangerous place. Protect your horse from danger with this beautiful handcrafted armor.\n" +
                "\n" +
                "\n" +
                "The Elder Scrolls IV: Oblivion® Game of the Year Edition Deluxe presents one of the best RPGs of all time like never before. Step inside the most richly detailed and vibrant game-world ever created. With a powerful combination of freeform gameplay and unprecedented graphics, you can unravel the main quest at your own pace or explore the vast world and find your own challenges.\n" +
                "\n" +
                "Live Another Life in Another World\n" +
                "Create and play any character you can imagine, from the noble warrior to the sinister assassin to the wizened sorcerer.\n" +
                "First Person Melee and Magic\n" +
                "An all-new combat and magic system brings first person role-playing to a new level of intensity where you feel every blow.\n" +
                "Radiant AI\n" +
                "This groundbreaking AI system gives Oblivion's characters full 24/7 schedules and the ability to make their own choices based on the world around them. Non-player characters eat, sleep, and complete goals all on their own.\n" +
                "New Lands to Explore\n" +
                "In the Shivering Isles expansion, see a world created in Sheogorath's own image, one divided between Mania and Dementia and unlike anything you've experienced in Oblivion.\n" +
                "Challenging new foes\n" +
                "Battle the denizens of Shivering Isles, a land filled with hideous insects, Flesh Atronachs, skeletal Shambles, amphibious Grummites, and many more.\n" +
                "Begin a New Faction\n" +
                "The Knights of the Nine have long been disbanded. Reclaim their former glory as you traverse the far reaches of Cyrodill across an epic quest line.");
        mGameLinks.add("https://www.gog.com/game/elder_scrolls_iv_oblivion_game_of_the_year_edition_deluxe_the");

        mGamePics.add("https://images.gog.com/6fd386523e72e28d7f85261229a1cf8200fb34f8e54f6557843e500082d7c427_product_card_v2_logo_480x285.png");
        mGameTitles.add("Fallout: New Vegas Ultimate Edition");
        mGameGenres.add("Role-playing - Action - Open World");
        mGameDescriptions.add("When you buy this game, The Elder Scrolls: Arena and The Elder Scrolls Chapter II: Daggerfall will be added to your GOG.com account for free!\n" +
                "\n" +
                "With the Ultimate Edition, Bethesda Softworks offers you the chance to double-down and get the complete package of New Vegas fun. The Fallout: New Vegas Ultimate Edition includes the full suite of highly acclaimed add-on content: Dead Money, Honest Hearts, Old World Blues, and Lonesome Road. To sweeten the pot, you’ll be armed with the latest cache of unique weapons, ammo types and recipes from the most recent add-on packs: Courier’s Stash and Gun Runners Arsenal. Whether you’re a seasoned explorer of the Mojave or playing the game for the first time, you’ll find there are more friends and enemies to make, more consequences to your actions and more opportunities to live in glory or infamy throughout the Wasteland. The choices you make will be as crucial to your survival as ever. \n" +
                "\n" +
                "Welcome to Vegas. New Vegas. \n" +
                "\n" +
                "It’s the kind of town where you dig your own grave prior to being shot in the head and left for dead… and that’s before things really get ugly. It’s a town of dreamers and desperados being torn apart by warring factions vying for complete control of this desert oasis. It’s a place where the right kind of person with the right kind of weaponry can really make a name for themselves, and make more than an enemy or two along the way. As you battle your way across the heat-blasted Mojave Wasteland, the colossal Hoover Dam, and the neon drenched Vegas Strip, you’ll be introduced to a colorful cast of characters, power-hungry factions, special weapons, mutated creatures, and much more. Choose sides in the upcoming war or declare “winner takes all” and crown yourself the King of New Vegas in this follow-up to the 2008 videogame of the year, Fallout 3. \n" +
                "\n" +
                "Enjoy your stay.\n" +
                "Feel the Heat in New Vegas!\n" +
                "Not even nuclear fallout could slow the hustle of Sin City. Explore the vast expanses of the desert wastelands – from the small towns dotting the Mojave Wasteland to the bright lights of the New Vegas strip. See the Great Southwest as could only be imagined in Fallout.\n" +
                "Feuding Factions, Colorful Characters and a Host of Hostiles!\n" +
                "A war is brewing between rival factions with consequences that will change the lives of all the inhabitants of New Vegas. The choices you make will bring you into contact with countless characters, creatures, allies, and foes, and determine the final explosive outcome of this epic power struggle.\n" +
                "New Systems!\n" +
                "Enjoy new additions to Fallout: New Vegas, such as a Companion Wheel that streamlines directing your companions, a Reputation System that tracks the consequences of your actions, and the aptly titled Hardcore Mode to separate the meek from the mighty. Special melee combat moves have been added to bring new meaning to the phrase “up close and personal”. Use V.A.T.S. to pause time in combat, target specific enemy body parts and queue up attacks, or get right to the action using the finely-tuned real-time combat mechanics.\n" +
                "An Arsenal of Shiny New Guns!\n" +
                "With double the amount of weapons found in Fallout 3, you’ll have more than enough new and exciting ways to deal with the threats of the wasteland and the locals. In addition, Vault-Tec engineers have devised a new weapons configuration system that lets you tinker with your toys and see the modifications you make in real time.\n" +
                "Let it Ride!\n" +
                "In a huge, open world with unlimited options you can see the sights, choose sides, or go it alone. Peacemaker or Hard Case, House Rules, or the Wild Card - it’s all in how you play the game.");
        mGameLinks.add("https://www.gog.com/game/fallout_new_vegas_ultimate_edition");

        mGamePics.add("https://images.gog.com/4ec37531d4150575197a4468b1acc2bfe67fcd5e683650fd0e8675b83763dbae_product_card_v2_logo_480x285.png");
        mGameTitles.add("Fallout 3: Game of the Year Edition");
        mGameGenres.add("Role-playing - FPP - Open World");
        mGameDescriptions.add("When you buy this game, The Elder Scrolls: Arena and The Elder Scrolls Chapter II: Daggerfall will be added to your GOG.com account for free!\n" +
                "\n" +
                "Prepare for the Future™\n" +
                "With Fallout 3: Game of the Year Edition, experience the most acclaimed game of 2008 like never before. Create a character of your choosing and descend into an awe-inspiring, post-apocalyptic world where every minute is a fight for survival. Fallout 3: Game of the Year Edition includes all five of the Fallout 3 Game Add-on Packs:\n" +
                "\n" +
                "Operation: Anchorage - Enter a military simulation and fight in the liberation of Anchorage, Alaska from its Chinese Communist invaders.\n" +
                "The Pitt - Travel to the post-apocalyptic remains of Pittsburgh and become embroiled in a conflict between slaves and their Raider masters.\n" +
                "Broken Steel - Increase your level cap to 30, and finish the fight against the Enclave remnants alongside Liberty Prime.\n" +
                "Point Lookout - Embark on a mysterious and open-ended adventure in a huge, murky swampland along the coast of Maryland.\n" +
                "Mothership Zeta - Defy hostile alien abductors and fight your way off of the alien mothership, orbiting miles above the Capital Wasteland.\n" +
                "\n" +
                "Main Features:\n" +
                "Limitless Freedom - Take in the sights and sounds of the vast Capital Wasteland! See the great monuments of the United States lying in post-apocalyptic ruin! You make the choices that define you and change the world. Just keep an eye on your Rad Meter!\n" +
                "\n" +
                "Experience S.P.E.C.I.A.L. - Vault-Tec engineers bring you the latest in human ability simulation — the SPECIAL Character System! Utilizing new breakthroughs in points-based ability representation, SPECIAL affords unlimited customization of your character. Also included are dozens of unique skills and perks to choose from, each with a dazzling variety of effects!\n" +
                "\n" +
                "Fantastic New Views - The wizards at Vault-Tec have done it again! No longer constrained to just one view, experience the world from 1st or 3rd person perspective. Customize your view with the touch of a button!\n" +
                "\n" +
                "The Power of Choice - Feeling like a dastardly villain today, or a Good Samaritan? Pick a side or walk the line, as every situation can be dealt with in many different ways. Talk out your problems in a civilized fashion, or just flash your Plasma Rifle.\n" +
                "\n" +
                "Blast 'Em Away With V.A.T.S. - Even the odds in combat with the Vault-Tec Assisted Targeting System for your Pip-Boy Model 3000! V.A.T.S. allows you to pause time in combat, target specific body parts on your target, queue up attacks, and let Vault-Tec take out your aggression for you. Rain death and destruction in an all-new cinematic presentation.\n" +
                "\n" +
                "Mind-Blowing Artificial Intelligence - At Vault-Tec, we realize that the key to reviving civilization after a global nuclear war is people. Our best minds pooled their efforts to produce an advanced version of Radiant AI, America's First Choice in Human Interaction Simulation. Facial expressions, gestures, unique dialog, and lifelike behavior are brought together with stunning results by the latest in Vault-Tec technology.\n" +
                "\n" +
                "Eye-Popping Prettiness* - Witness the harsh realities of nuclear fallout rendered like never before in modern super-deluxe HD graphics. From the barren Wasteland, to the danger-filled offices and metro tunnels of DC, to the hideous rotten flesh of a mutant's face.");
        mGameLinks.add("https://www.gog.com/game/fallout_3_game_of_the_year_edition");

        mGamePics.add("https://images.gog.com/8b992f4f7f82190cfa7a4347a51d21f9ca49b76cfa29b643546384f08c963d07_product_card_v2_logo_960x570.png");
        mGameTitles.add("Neverwinter Nights 2 Complete");
        mGameGenres.add("Role-playing - Adventure - Fantasy");
        mGameDescriptions.add("When you buy this game, The Elder Scrolls: Arena and The Elder Scrolls Chapter II: Daggerfall will be added to your GOG.com account for free!\n" +
                "\n" +
                "Prepare for the Future™\n" +
                "With Fallout 3: Game of the Year Edition, experience the most acclaimed game of 2008 like never before. Create a character of your choosing and descend into an awe-inspiring, post-apocalyptic world where every minute is a fight for survival. Fallout 3: Game of the Year Edition includes all five of the Fallout 3 Game Add-on Packs:\n" +
                "\n" +
                "Operation: Anchorage - Enter a military simulation and fight in the liberation of Anchorage, Alaska from its Chinese Communist invaders.\n" +
                "The Pitt - Travel to the post-apocalyptic remains of Pittsburgh and become embroiled in a conflict between slaves and their Raider masters.\n" +
                "Broken Steel - Increase your level cap to 30, and finish the fight against the Enclave remnants alongside Liberty Prime.\n" +
                "Point Lookout - Embark on a mysterious and open-ended adventure in a huge, murky swampland along the coast of Maryland.\n" +
                "Mothership Zeta - Defy hostile alien abductors and fight your way off of the alien mothership, orbiting miles above the Capital Wasteland.\n" +
                "\n" +
                "Main Features:\n" +
                "Limitless Freedom - Take in the sights and sounds of the vast Capital Wasteland! See the great monuments of the United States lying in post-apocalyptic ruin! You make the choices that define you and change the world. Just keep an eye on your Rad Meter!\n" +
                "\n" +
                "Experience S.P.E.C.I.A.L. - Vault-Tec engineers bring you the latest in human ability simulation — the SPECIAL Character System! Utilizing new breakthroughs in points-based ability representation, SPECIAL affords unlimited customization of your character. Also included are dozens of unique skills and perks to choose from, each with a dazzling variety of effects!\n" +
                "\n" +
                "Fantastic New Views - The wizards at Vault-Tec have done it again! No longer constrained to just one view, experience the world from 1st or 3rd person perspective. Customize your view with the touch of a button!\n" +
                "\n" +
                "The Power of Choice - Feeling like a dastardly villain today, or a Good Samaritan? Pick a side or walk the line, as every situation can be dealt with in many different ways. Talk out your problems in a civilized fashion, or just flash your Plasma Rifle.\n" +
                "\n" +
                "Blast 'Em Away With V.A.T.S. - Even the odds in combat with the Vault-Tec Assisted Targeting System for your Pip-Boy Model 3000! V.A.T.S. allows you to pause time in combat, target specific body parts on your target, queue up attacks, and let Vault-Tec take out your aggression for you. Rain death and destruction in an all-new cinematic presentation.\n" +
                "\n" +
                "Mind-Blowing Artificial Intelligence - At Vault-Tec, we realize that the key to reviving civilization after a global nuclear war is people. Our best minds pooled their efforts to produce an advanced version of Radiant AI, America's First Choice in Human Interaction Simulation. Facial expressions, gestures, unique dialog, and lifelike behavior are brought together with stunning results by the latest in Vault-Tec technology.\n" +
                "\n" +
                "Eye-Popping Prettiness* - Witness the harsh realities of nuclear fallout rendered like never before in modern super-deluxe HD graphics. From the barren Wasteland, to the danger-filled offices and metro tunnels of DC, to the hideous rotten flesh of a mutant's face.");
        mGameLinks.add("https://www.gog.com/game/neverwinter_nights_2_complete");

        mGamePics.add("https://images.gog.com/8f7c4d22a059476989391174b8e4598aaa2ee9da7e1104b620ee75ee3ac6e61f_product_card_v2_logo_960x570.png");
        mGameTitles.add("Divinity: Original Sin 2 - Definitive Edition");
        mGameGenres.add("Role-playing - Real-time - Fantasy");
        mGameDescriptions.add("The eagerly anticipated sequel to the award-winning RPG. Gather your party. Master deep, tactical combat. Join up to 3 other players - but know that only one of you will have the chance to become a God.\n" +
                "The Divine is dead. The Void approaches. And the powers lying dormant within you are soon to awaken. The battle for Divinity has begun. Choose wisely and trust sparingly; darkness lurks within every heart. \n" +
                "Who will you be?\n" +
                "A flesh-eating Elf, an Imperial Lizard or an Undead, risen from the grave? Discover how the world reacts differently to who - or what - you are. \n" +
                "It’s time for a new Divinity!\n" +
                "Gather your party and develop relationships with your companions. Blast your opponents in deep, tactical, turn-based combat. Use the environment as a weapon, use height to your advantage, and manipulate the elements themselves to seal your victory.\n" +
                "Ascend as the god that Rivellon so desperately needs.\n" +
                "Explore the vast and layered world of Rivellon alone or in a party of up to 4 players in drop-in/drop-out cooperative play. Go anywhere, unleash your imagination, and explore endless ways to interact with the world. Beyond Rivellon, there’s more to explore in the brand-new PvP and Game Master modes. ");
        mGameLinks.add("https://www.gog.com/game/divinity_original_sin_2");

        mGamePics.add("https://images.gog.com/270abb6fc698d7c4353c314230672cdfb71a9b6911bc033218d5b5d56fc30e53_product_card_v2_logo_960x570.png");
        mGameTitles.add("Baldur's Gate: Enhanced Edition");
        mGameGenres.add("Role-playing - Real-time - Fantasy");
        mGameDescriptions.add("Baldur's Gate: Enhanced Edition includes the classic Baldur's Gate: The Original Saga.\n" +
                "\n" +
                "Since its initial release in 1998, Baldur's Gate has entertained millions of fans around the globe and has received countless awards. This classic saga of mystery, intrigue, and adventure has set the standard for Dungeons & Dragons™ computer roleplaying games ever since. \n" +
                "\n" +
                "Running on an upgraded and improved version of the Infinity Engine, Baldur's Gate: Enhanced Edition™ includes the entire Baldur's Gate adventure, the Tales of the Sword Coast expansion pack, and never-before-seen content including a new adventure and three new party members: the Calishite monk Rasaad yn Bashir, Neera the wild mage, and Dorn Il-Khan, the evil blackguard.\n" +
                "New Adventure: The Black Pits\n" +
                "New Character: Dorn Il-Khan\n" +
                "New Character: Neera the Wild Mage\n" +
                "New Character: Rasaad yn Bashir\n" +
                "A new collection of player character voice sets\n" +
                "Native support for high-resolution widescreen displays\n" +
                "Over 400 improvements to the original game\n" +
                "Improved multiplayer support with connectivity between all platforms");
        mGameLinks.add("https://www.gog.com/game/baldurs_gate_enhanced_edition");

        mGamePics.add("https://images.gog.com/ffc7b35ec88f942ed19e44aa7353ce80a6d5954a819a5cb10abf14e6c2f930fc_product_card_v2_logo_960x570.png");
        mGameTitles.add("Baldur's Gate II: Enhanced Edition");
        mGameGenres.add("Role-playing - Real-time - Fantasy");
        mGameDescriptions.add("Baldur's Gate II: Enhanced Edition includes the classic Baldur's Gate 2 Complete.\n" +
                "\n" +
                "Kidnapped. Imprisoned. Tortured. The wizard Irenicus holds you captive in his stronghold, attempting to strip you of the powers that are your birthright. \n" +
                "\n" +
                "Can you resist the evil within you, forge a legend of heroic proportions, and ultimately destroy the dark essence that haunts your dreams? Or will you embrace your monstrous nature, carve a swath of destruction across the realms, and ascend to godhood as the new Lord of Murder? \n" +
                "\n" +
                "Baldur's Gate II: Enhanced Edition brings this critically acclaimed role-playing experience to back to life.\n" +
                "The Final Chapter - Baldur's Gate II: Enhanced Edition includes Baldur's Gate II: Shadows of Amn and Baldur's Gate II: Throne of Bhaal, the epic conclusion of the Bhaalspawn saga.\n" +
                "Four New Party Members - Bundled with Baldur's Gate II: Enhanced Edition are four new characters that can join you on your journey.\n" +
                "The Black Pits 2: Gladiators of Thay - Explore the tactical depth of high-level Dungeons & Dragons combat. Undermine your captors and prey upon their weaknesses while you dodge traps and battle for your life against Demi-Liches, Mind Flayers, and Githyanki.\n" +
                "Easy Multiplayer - Baldur's Gate II: Enhanced Edition makes it easy to find, list, and join multiplayer games, even while behind a firewall.\n" +
                "Widescreen and More - Baldur's Gate II: Enhanced Edition features full widescreen support, remastered area artwork from original renders, and a host of other interface and gameplay improvements.");
        mGameLinks.add("https://www.gog.com/game/baldurs_gate_2_enhanced_edition");

        loadRecycleView();
    }

    private void loadRecycleView() {
        Log.d(TAG, "loadRecycleView: init recycleview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mGamePics, mGameTitles, mGameGenres, mGameDescriptions, mGameLinks);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    public void launchAboutActivity(MenuItem mi) {
        Log.d(TAG, "Info Button clicked!");
        //Toast.makeText(this, "Info test!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

}
