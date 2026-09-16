package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٙؗ۟ٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1686 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f5611;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f5612;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C2830 f5613;

    /* JADX INFO: renamed from: ۥۗ */
    public final List[] f5614;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f5615;

    /* JADX INFO: renamed from: ۦؑ */
    public int f5616;

    public C1686(C2830 c2830, List list) {
        this.f5613 = c2830;
        this.f5615 = list;
        this.f5614 = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC4690.m8038("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
