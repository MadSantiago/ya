package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: ۥٗ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0025 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Collection f5078;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5079;

    public /* synthetic */ C0025(int i, Collection collection) {
        this.f5079 = i;
        this.f5078 = collection;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        boolean zContains;
        int i = this.f5079;
        Collection<?> collection = this.f5078;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
