ALTER TABLE `challenger`.`arquivo` 
ADD COLUMN `idusu` INT NULL AFTER `dttrans`;

ALTER TABLE `challenger`.`arquivo` 
ADD CONSTRAINT `id`
  FOREIGN KEY (`idusu`)
  REFERENCES `challenger`.`usuario` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
