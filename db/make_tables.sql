-- Drop table if exists `board`;
Create table `board`
(
    `id`          int          NOT NULL,
    `title`       varchar(255) NOT NULL,
    `description` varchar(255) NOT NULL,
    `deleted`     tinyint      NOT NULL,
    PRIMARY KEY (`id`)
);