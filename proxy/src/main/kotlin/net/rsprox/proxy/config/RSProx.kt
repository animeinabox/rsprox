package net.rsprox.proxy.config

import java.nio.file.Path
import kotlin.io.path.Path

internal val CONFIGURATION_PATH: Path = Path(System.getProperty("user.home"), ".rsprox")
internal val BINARY_PATH: Path = CONFIGURATION_PATH.resolve("binary")
