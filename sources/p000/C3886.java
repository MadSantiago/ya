package p000;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦُۣؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3886 implements Closeable {

    /* JADX INFO: renamed from: ۥْ */
    public final ReentrantLock f12997 = new ReentrantLock();

    /* JADX INFO: renamed from: ۥٓ */
    public final RandomAccessFile f12998;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f12999;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f13000;

    public C3886(RandomAccessFile randomAccessFile) {
        this.f12998 = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f12997;
        reentrantLock.lock();
        try {
            if (this.f13000) {
                reentrantLock.unlock();
                return;
            }
            this.f13000 = true;
            if (this.f12999 != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f12998.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f12997;
        reentrantLock.lock();
        try {
            if (this.f13000) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f12998.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2297 m6971(long j) {
        ReentrantLock reentrantLock = this.f12997;
        reentrantLock.lock();
        try {
            if (this.f13000) {
                throw new IllegalStateException("closed");
            }
            this.f12999++;
            reentrantLock.unlock();
            return new C2297(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
