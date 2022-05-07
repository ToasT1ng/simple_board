Drop table if exists `board`;
Drop table if exists `category`;
Drop table if exists `user`;

-- Drop table if exists `user`;
Create table `user`
(
    `user_id`    bigint       NOT NULL,
    `password`   varchar(255) NOT NULL,
    `nickname`   varchar(255) NOT NULL,
    `alert`      tinyint  DEFAULT 1,
    `point`      int      DEFAULT 0,
    `since`      datetime DEFAULT CURRENT_TIMESTAMP,
    `user_level` varchar(255) NOT NULL,
    PRIMARY KEY (`user_id`)
);

-- Drop table if exists `category`;
Create table `category`
(
    `category_id`         bigint       NOT NULL,
    `parent_id`           bigint       NOT NULL,
    `order_number`        int          NOT NULL,
    `category_name`       varchar(255) NOT NULL,
    `description`         varchar(255) NOT NULL,
    `category_user_level` varchar(255) NOT NULL,
    PRIMARY KEY (`category_id`)
);

-- Drop table if exists `board`;
Create table `board`
(
    `board_id`     bigint       NOT NULL,
    `board_number` int AUTO_INCREMENT NOT NULL,
    `title`        varchar(255) NOT NULL,
    `content`      varchar(255) NOT NULL,
    `category_id`  bigint       NOT NULL,
    `hits`         int      DEFAULT 0,
    `user_id`      bigint       NOT NULL,
    `likes`        int      DEFAULT 0,
    `update_date`  datetime DEFAULT CURRENT_TIMESTAMP,
    `deleted`      tinyint  DEFAULT 0,
    `notice_level` varchar(255) NOT NULL,
    PRIMARY KEY (`board_id`),
    KEY (`board_number`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
    FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
);