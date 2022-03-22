package com.example.quizapp

object Constants{
    fun getQuestion() : ArrayList<Question>{
        val QList= ArrayList<Question>()
        val q1=Question(1,
            "Which phrase best describes the current role of the managerial accountant?",
        "Managerial accountants prepare the financial statements for an organization",
        "Managerial accountants facilitate the decision-making process within an organization",
        "Managerial accountants make the key decisions within an organization",
        "Managerial accountants are primarily information collectors",
        "Managerial Accountants are solely staff advisors in an organization",
            2)
        QList.add(q1)
        val q2=Question(
            2,
            "An example of qualitative data is:",
            " product cost ",
            "customer satisfaction",
            "net income",
            "inventory cost",
            "net worth. ",
            2)
        QList.add(q2)

        val q3=Question(
            3,
            "Product and service costing information is prepared for",
            "manufacturing companies with inventory. ",
            "merchandising companies",
            "service providers. ",
            "each of the other four answers..",
            "manufacturing companies without inventory.",
            4)
        QList.add(q3)
        val q4=Question(
            4,
            "Manufacturing costs typically consist of",
            "direct materials, direct labor, and manufacturing overhead. ",
            "production and shipping costs.",
            "production and marketing costs.",
            "direct materials, direct labor, and administrative costs.",
            "e. direct materials, direct labor, marketing and administrative costs.",
            1)
        QList.add(q4)

        val q5=Question(
            5,
            "In comparison to the traditional manufacturing environment, overhead costs in a JIT\n" +
                    "environment all the following are true except: ",
        "are more easily tracked to products. ",
            "are frequently direct in nature. ",
            "include rent, insurance and utilities.",
            "most of the costs are likely to be indirect in nature. ",
            "labor need not be tracked to the product. ",
            4)
        QList.add(q5)

        val q6=Question(
            6,
            "As production increases within the relevant range",
            "variable costs will vary on a per unit basis.",
            "variable costs will vary in total.",
            "fixed costs will vary in total.",
            "fixed and variable cost stay the same in total.",
            "none of the other four answers is true.",
            2)
        QList.add(q6)

        val q7=Question(
            7,
            "You are given the cost and volume information below:\n" +
                    "\n" +
                    "Volume Cost 1 unit $ 15\n" +
                    "10 units 150\n" +
                    "100 units 1500\n" +
                    "\n" +
                    "What type of a cost is given? \n",
            "fixed cost",
            "variable cost ",
            "step cost",
            "mixed cost ",
            "rent cost.",
            2)
        QList.add(q7)

        val q8=Question(
            8,
            "Which of the following statements regarding graphs of fixed and variable costs is true?",
            "Variable costs can be represented by a straight line where costs are the same for each\n" +
                    " data point",
            "Fixed costs can be represented by a straight line starting at the origin and continuing\n" +
                    " through each data point. ",
            "Fixed costs are zero when production is equal to zero. ",
            "Variable costs are zero when production is equal to zero.",
            "Fixed and Variable costs are curvilinear form above zero on the “Y” axis. ",
            4)
        QList.add(q8)

        val q9=Question(
            9,
            "All of the following statements regarding budgeting is true except",
            "Budgeting helps managers determine the resources needed to meet their goals and\n" +
                    " objectives. ",
            "Budgeting is a key ingredient in good decision-making. ",
            "Budgeting is a bookkeeping task",
            "The focus of budgeting is planning. ",
            "Budgeting is an executive responsibility. ",
            3)
        QList.add(q9)

        val q10=Question(
            10,
            "Broihan Corporation has the following purchases budget for the last half of 2002:\n" +
                    "\n" +
                    "July     $100,000 October $ 90,000\n" +
                    "August     80,000 November 100,000\n" +
                    "September 110,000 December  94,000\n" +
                    "\n" +
                    "Historically, the company pays one half at the time of purchase and the remainder in the month\n" +
                    "following purchase.\n" +
                    "\n" +
                    "What are the expected cash disbursements in August? ",
            "$ 80,000",
            "$ 90,000",
            "$ 95,000",
            "$ 100,000",
            "$ 105,000",
            2)
        QList.add(q10)

        val q11=Question(
            11,
            "The Unique Bookshelf Company is considering the purchase of a custom delivery van\n" +
                    "costing approximately $50,000. Using a discount rate of 20%, the present value of future cost\n" +
                    "savings is estimated at $51,200. To yield the 20% return, the actual cost of the van should not\n" +
                    "exceed the $50,000 estimate by more than: ",
            "$50,000",
            "$51,200",
            "$25,000",
            "$1,200",
            "20%",
            4)
        QList.add(q11)

        return QList
    }
}