Drop table if exists `user`;
Create table `user`
(
    `user_id`    int          NOT NULL,
    `password`   varchar(255) NOT NULL,
    `nickname`   varchar(255) NOT NULL,
    `alert`      tinyint      NOT NULL,
    `point`      int          NOT NULL,
    `since`      datetime DEFAULT CURRENT_TIMESTAMP,
    `user_level` varchar(255) NOT NULL,
    PRIMARY KEY (`user_id`)
);

Drop table if exists `category`;
Create table `category`
(
    `category_id`    int          NOT NULL,
    `parent_id`      int          NOT NULL,
    `order`          int          NOT NULL,
    `name`           varchar(255) NOT NULL,
    `description`    varchar(255) NOT NULL,
    `category_level` varchar(255) NOT NULL,
    PRIMARY KEY (`category_id`)
);

Drop table if exists `board`;
Create table `board`
(
    `board_id`     int          NOT NULL,
    `board_number` int          NOT NULL,
    `title`        varchar(255) NOT NULL,
    `content`      varchar(255) NOT NULL,
    `category_id`  int          NOT NULL,
    `hits`         int          NOT NULL,
    `user_id`      int          NOT NULL,
    `likes`        int          NOT NULL,
    `date`         datetime DEFAULT CURRENT_TIMESTAMP,
    `deleted`      tinyint      NOT NULL,
    `notice_level` varchar(255) NOT NULL,
    PRIMARY KEY (`board_id`),
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
    FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
);