package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۢؓۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5524 {

    /* JADX INFO: renamed from: ۥُ */
    public static final HashMap f18238 = new HashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public final Lock f18239;

    /* JADX INFO: renamed from: ۥۗ */
    public final File f18240;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f18241;

    /* JADX INFO: renamed from: ۦؑ */
    public FileChannel f18242;

    public C5524(String str, File file, boolean z) {
        Lock lock;
        this.f18241 = z;
        this.f18240 = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f18238;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18239 = lock;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9205() {
        try {
            FileChannel fileChannel = this.f18242;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f18239.unlock();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9206(boolean z) {
        this.f18239.lock();
        if (z) {
            File file = this.f18240;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f18242 = channel;
            } catch (IOException e) {
                this.f18242 = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }
}
