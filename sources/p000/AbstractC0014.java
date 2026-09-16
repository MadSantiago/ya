package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: ۥٌ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0014 extends AbstractList implements List, InterfaceC3984 {
    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo1860(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo1859();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract int mo1859();

    /* JADX INFO: renamed from: ۦؑ */
    public abstract Object mo1860(int i);
}
