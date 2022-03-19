create user 'board_user'@'%' identified by 'board1234';

grant all privileges on board.* to board_user@'%';

flush privileges;