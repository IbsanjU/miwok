package com.ibsanju.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public
class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param ImageResourceID    is the Image in the Miwok assets
     */

    public
    Word(String defaultTranslation, String miwokTranslation, int ImageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
        mImageResourceId    = ImageResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public
    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the Image Resource ID of the word.
     */
    public
    int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public
    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
