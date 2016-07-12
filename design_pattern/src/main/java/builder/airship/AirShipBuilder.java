package builder.airship;


public interface AirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower  builderEscapeTower();
}
