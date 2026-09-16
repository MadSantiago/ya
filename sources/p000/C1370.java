package p000;

import java.text.BreakIterator;

/* JADX INFO: renamed from: ۥٔؗۧٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1370 extends AbstractC2765 {

    /* JADX INFO: renamed from: ۥۤ */
    public final BreakIterator f4689;

    public C1370(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f4689 = characterInstance;
    }

    @Override // p000.AbstractC2765
    /* JADX INFO: renamed from: ۦٞ */
    public final int mo2900(int i) {
        return this.f4689.following(i);
    }

    @Override // p000.AbstractC2765
    /* JADX INFO: renamed from: ۦٟ */
    public final int mo2901(int i) {
        return this.f4689.preceding(i);
    }
}
