package edu.temple.flossplayer.audlibtest

import edu.temple.audlibplayer.PlayerService

/**
 * Singleton book class for testing.
 */
enum class TestBook(
    /** this book's ID number */
    val id: Int
): PlayerService.FlossAudioBook {
    /** The test book instance */
    INSTANCE(1);

    /**
     * @inheritDoc
     */
    override fun getBookId() = id
}
