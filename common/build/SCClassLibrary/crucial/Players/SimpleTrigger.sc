
// thanks to Maurizio for help working on this
		value = spec.maxval;
	}
	trig { arg val;
		action.value(this);
		value = val ? spec.maxval;
		this.changed(this);
	}

	synthArg { ^spec.minval }
		super.didStop;
		patchOut.free;
		patchOut = nil;
	}