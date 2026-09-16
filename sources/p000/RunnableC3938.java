package p000;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦؙِؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3938 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f13148;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Typeface f13149;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ TextView f13150;

    public RunnableC3938(TextView textView, Typeface typeface, int i) {
        this.f13150 = textView;
        this.f13149 = typeface;
        this.f13148 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13150.setTypeface(this.f13149, this.f13148);
    }
}
