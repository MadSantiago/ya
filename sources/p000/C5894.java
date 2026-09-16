package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦۨؖۚٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5894 implements InputFilter {

    /* JADX INFO: renamed from: ۥۣ */
    public final TextView f19442;

    public C5894(TextView textView) {
        this.f19442 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f19442.isInEditMode()) {
            return charSequence;
        }
        AbstractC0949.m1933();
        throw null;
    }
}
