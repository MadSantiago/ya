package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.BitSet;
import p000.AbstractC1434;
import p000.AbstractC4593;
import p000.C0968;
import p000.C1078;
import p000.C4036;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC4593 {

    /* JADX INFO: renamed from: ۦؚ */
    public final AbstractC1434 f233;

    /* JADX INFO: renamed from: ۦٌ */
    public final int f234;

    /* JADX INFO: renamed from: ۦِ */
    public final C4036[] f235;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f236;

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC1434 f237;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f236 = -1;
        new Rect();
        C0968 c0968M7970 = AbstractC4593.m7970(context, attributeSet, i, i2);
        int i3 = c0968M7970.f3420;
        if (i3 != 0 && i3 != 1) {
            C1078.m2272("invalid orientation.");
            throw null;
        }
        if (i3 != this.f234) {
            this.f234 = i3;
            AbstractC1434 abstractC1434 = this.f237;
            this.f237 = this.f233;
            this.f233 = abstractC1434;
        }
        int i4 = c0968M7970.f3419;
        if (i4 != this.f236) {
            this.f236 = i4;
            new BitSet(this.f236);
            this.f235 = new C4036[this.f236];
            for (int i5 = 0; i5 < this.f236; i5++) {
                C4036[] c4036Arr = this.f235;
                C4036 c4036 = new C4036(27);
                new ArrayList();
                c4036Arr[i5] = c4036;
            }
        }
        this.f237 = AbstractC1434.m3063(this, this.f234);
        this.f233 = AbstractC1434.m3063(this, 1 - this.f234);
    }
}
