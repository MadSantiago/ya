package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import p000.AbstractC4593;
import p000.AbstractC5078;
import p000.C1078;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: ۦٌ */
    public final int f228;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f228 = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = AbstractC4593.m7970(context, attributeSet, i, i2).f3419;
        if (i3 == this.f228) {
            return;
        }
        if (i3 < 1) {
            C1078.m2272(AbstractC5078.m8670(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.f228 = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ۦؖ */
    public final void mo81(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo81(false);
    }
}
