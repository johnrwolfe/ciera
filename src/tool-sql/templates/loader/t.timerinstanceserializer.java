        for ( Timer $l{self.class_name}_inst : population.getRunContext().getActiveTimers().where(selected -> selected.getPopulationId() == population.getId()) ) serialize_${self.class_name}( $l{self.class_name}_inst, out );