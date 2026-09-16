package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥٞؑؔؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1921 implements InterfaceC4883 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f6340;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f6341;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6342;

    public /* synthetic */ C1921(int i, Object obj, Object obj2) {
        this.f6342 = i;
        this.f6341 = obj;
        this.f6340 = obj2;
    }

    @Override // p000.InterfaceC4883
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1376() {
        switch (this.f6342) {
            case 0:
                C5136 c5136 = (C5136) this.f6341;
                c5136.f17021.removeCallbacks((Runnable) this.f6340);
                return;
            default:
                String str = (String) this.f6341;
                C5544 c5544 = (C5544) this.f6340;
                synchronized (FileObserverC1615.f5421) {
                    LinkedHashMap linkedHashMap = FileObserverC1615.f5420;
                    FileObserverC1615 fileObserverC1615 = (FileObserverC1615) linkedHashMap.get(str);
                    if (fileObserverC1615 != null) {
                        fileObserverC1615.f5422.remove(c5544);
                        if (fileObserverC1615.f5422.isEmpty()) {
                            linkedHashMap.remove(str);
                            fileObserverC1615.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
