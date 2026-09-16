package p000;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ۥ٘ؗۦَ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC1615 extends FileObserver {

    /* JADX INFO: renamed from: ۥۣ */
    public final CopyOnWriteArrayList f5422;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Object f5421 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public static final LinkedHashMap f5420 = new LinkedHashMap();

    public FileObserverC1615(String str) {
        super(str, 128);
        this.f5422 = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator it = this.f5422.iterator();
        while (it.hasNext()) {
            ((InterfaceC4745) it.next()).mo211(str);
        }
    }
}
