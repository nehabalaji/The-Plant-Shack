package com.project.theplantshack.data.resource

import com.project.theplantshack.R
import com.project.theplantshack.data.model.Blog
import com.project.theplantshack.data.model.Plant

object SampleData {

    fun getPlants(): ArrayList<Plant> = arrayListOf(
        Plant(
            id = 1,
            name = "Ficus pandurata",
            price = 5.9,
            category = "Houseplants",
            image = R.drawable.ficus_pandurata_hance
        ),
        Plant(
            id = 2,
            name = "Euphorbia officinarum",
            price = 3.1,
            category = "Cactus",
            image = R.drawable.euphorbia_officinarum_l
        ),
        Plant(
            id = 3,
            name = "Marginatocereus marginatus",
            price = 4.01,
            category = "Cactus",
            image = R.drawable.marginatocereus_marginatus
        ),
        Plant(
            id = 4,
            name = "Pinus parviflora",
            price = 12.3,
            category = "Trees",
            image = R.drawable.pinus_parviflora
        ),
        Plant(
            id = 5,
            name = "Haworthia attenuata",
            price = 2.5,
            category = "Cactus",
            image = R.drawable.haworthia_attenuata
        ),
        Plant(
            id = 6,
            name = "Tulipa agenensis",
            price = 0.0,
            category = "Flowers",
            image = R.drawable.tulipa_agenensis
        ),
        Plant(
            id = 7,
            name = "Aloe aristata",
            price = 1.13,
            category = "Houseplants",
            image = R.drawable.aloe_aristata
        ),
        Plant(
            id = 8,
            name = "Cereus repandus",
            price = 0.0,
            category = "Cactus",
            image = R.drawable.cereus_repandus
        ),
        Plant(
            id = 9,
            name = "Monstera adansonii",
            price = 21.3,
            category = "Houseplants",
            image = R.drawable.monstera_adansonii
        ),
        Plant(
            id = 10,
            name = "Zamioculcas zamiifolia",
            price = 2.9,
            category = "Houseplants",
            image = R.drawable.zamioculcas_zamiifolia
        ),
        Plant(
            id = 11,
            name = "Dieffenbachia seguine",
            price = 1.8,
            category = "Houseplants",
            image = R.drawable.dieffenbachia_seguine
        ),
        Plant(
            id = 12,
            name = "Sarracenia purpurea",
            price = 2.2,
            category = "Houseplants",
            image = R.drawable.sarracenia_purpurea
        )
    )

    fun getBlogs(): ArrayList<Blog> = arrayListOf(
        Blog(
            id = 1,
            title = "33 Best Houseplants Home Pictures for Inspiration",
            description = "If you’re about to beautify your interior with plants, take a look at these 33 Best Houseplants Home Pictures for Inspiration." +
                "Love indoor plants? Well, you are going to appreciate them more after viewing these 33 House Plants Home Pictures for Inspiration in this article.",
            image = R.drawable.explore_img_01,
            url = "https://balconygardenweb.com/best-house-plants-home-pictures-for-inspiration/"
        ),
        Blog(
            id = 2,
            title = "Modern Indoor Gardening: Decorating with Houseplants",
            description = "Houseplants make the best roommates. That’s not an invitation to debate, it’s an indisputable fact " +
                "(sorry Scott, the saxophone-playing dorm-mate from college). They’re quiet, hold a warm and welcoming presence, " +
                "aren’t terribly fussy, and generally clean up after themselves (and the air around them — bonus!).",
            image = R.drawable.explore_img_02,
            url = "https://www.article.com/blog/indoor-gardening-decorating-with-houseplants/"
        ),
        Blog(
            id = 3,
            title = "Why Indoor Plants Make You Feel Better",
            description = "Houseplants are good for your health — and not just for their visual beauty. Why? They essentially do the " +
                "opposite of what we do when we breathe: release oxygen and absorb carbon dioxide. This not only freshens up the air, " +
                "but also eliminates harmful toxins. Extensive research by NASA has revealed that houseplants can remove up to 87 per " +
                "cent of air toxin in 24 hours. Studies have also proven that indoor plants improve concentration and productivity " +
                "(by up to 15 percent!), reduce stress levels and boost your mood — making them perfect for not just your home but " +
                "your work space, too.",
            image = R.drawable.explore_img_03,
            url = "https://www.nbcnews.com/better/health/indoor-plants-can-instantly-boost-your-health-happiness-ncna781806"
        ),
        Blog(
            id = 4,
            title = "How to Display Houseplants: 98 of Our Favorite Plant-Display Ideas",
            description = "I’m a firm believer in the philosophy that one’s home can never have too many plants. They breathe life into any room they’re " +
                "placed in, and they come in a dizzying array of sizes, shapes, colors, and more. If you are struggling to find new ways to add more " +
                "plants to your own at-home jungle, you may find some ideas for fitting more flora in below. If you’re just looking to change things " +
                "up and give your home a new leaf on life, you’ll certainly find the plant displays below inspiring. And if you simply do not want to " +
                "or cannot literally fit any more plants into your home, you’ll still enjoy perusing through some of the creative, beautiful, weird, " +
                "and wild ways in which folks have incorporated plant life into their home.",
            image = R.drawable.explore_img_04,
            url = "https://www.apartmenttherapy.com/how-to-display-houseplants-36607205"
        ),
        Blog(
            id = 5,
            title = "7 beautiful interior plants and their virtues for your home",
            description = "Beyond their aesthetic dimension and the simple satisfaction of admiring their natural greenery at home, plants often " +
                "play a role that is more complex than it seems. Requiring care and attention, they have a wealth of qualities that give so many " +
                "good reasons to consider them.",
            image = R.drawable.explore_img_05,
            url = "https://www.vogue.fr/lifestyle-en/article/7-beautiful-interior-plants-and-their-virtues-for-your-home-indoors"
        )
    )
}
