package p000;

import android.os.FileObserver;
import java.io.File;

/* JADX INFO: renamed from: ۦُۢؑ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC5510 extends FileObserver {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f18191;

    public FileObserverC5510(BinderC4778 binderC4778, File file) {
        super(file.getParent(), 1984);
        file.getParent();
        this.f18191 = file.getName();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 1024 || this.f18191.equals(str)) {
            System.exit(0);
        }
    }
}
