package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦّؔٙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4030 implements Closeable {

    /* JADX INFO: renamed from: ۦٗ */
    public static final Logger f13440 = Logger.getLogger(C4030.class.getName());

    /* JADX INFO: renamed from: ۥَ */
    public C2268 f13441;

    /* JADX INFO: renamed from: ۥْ */
    public int f13442;

    /* JADX INFO: renamed from: ۥٓ */
    public C2268 f13443;

    /* JADX INFO: renamed from: ۥٖ */
    public final byte[] f13444;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f13445;

    /* JADX INFO: renamed from: ۦۨ */
    public final RandomAccessFile f13446;

    public C4030(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f13444 = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m7200(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    C5028.m8448("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f13446 = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iM7199 = m7199(0, bArr);
        this.f13445 = iM7199;
        if (iM7199 <= randomAccessFile2.length()) {
            this.f13442 = m7199(4, bArr);
            int iM71910 = m7199(8, bArr);
            int iM71911 = m7199(12, bArr);
            this.f13443 = m7203(iM71910);
            this.f13441 = m7203(iM71911);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f13445 + ", Actual length: " + randomAccessFile2.length());
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static int m7199(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static void m7200(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13446.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4030.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f13445);
        sb.append(", size=");
        sb.append(this.f13442);
        sb.append(", first=");
        sb.append(this.f13443);
        sb.append(", last=");
        sb.append(this.f13441);
        sb.append(", element lengths=[");
        try {
            m7211(new C0390(sb));
        } catch (IOException e) {
            f13440.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final synchronized boolean m7201() {
        return this.f13442 == 0;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final int m7202(int i) {
        int i2 = this.f13445;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final C2268 m7203(int i) throws IOException {
        if (i == 0) {
            return C2268.f7525;
        }
        RandomAccessFile randomAccessFile = this.f13446;
        randomAccessFile.seek(i);
        return new C2268(i, randomAccessFile.readInt(), 0);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m7204(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iM7202 = m7202(i);
        int i4 = iM7202 + i3;
        int i5 = this.f13445;
        RandomAccessFile randomAccessFile = this.f13446;
        if (i4 <= i5) {
            randomAccessFile.seek(iM7202);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iM7202;
        randomAccessFile.seek(iM7202);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7205(int i) throws IOException {
        int i2 = i + 4;
        int iM7210 = this.f13445 - m7210();
        if (iM7210 >= i2) {
            return;
        }
        int i3 = this.f13445;
        do {
            iM7210 += i3;
            i3 <<= 1;
        } while (iM7210 < i2);
        RandomAccessFile randomAccessFile = this.f13446;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C2268 c2268 = this.f13441;
        int iM7202 = m7202(c2268.f7527 + 4 + c2268.f7526);
        if (iM7202 < this.f13443.f7527) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f13445);
            long j = iM7202 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f13441.f7527;
        int i5 = this.f13443.f7527;
        if (i4 < i5) {
            int i6 = (this.f13445 + i4) - 16;
            m7208(i3, this.f13442, i5, i6);
            this.f13441 = new C2268(i6, this.f13441.f7526, 0);
        } else {
            m7208(i3, this.f13442, i5, i4);
        }
        this.f13445 = i3;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7206(byte[] bArr) {
        int iM7202;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    m7205(length);
                    boolean zM7201 = m7201();
                    if (zM7201) {
                        iM7202 = 16;
                    } else {
                        C2268 c2268 = this.f13441;
                        iM7202 = m7202(c2268.f7527 + 4 + c2268.f7526);
                    }
                    C2268 c2269 = new C2268(iM7202, length, 0);
                    m7200(this.f13444, 0, length);
                    m7207(this.f13444, iM7202, 4);
                    m7207(bArr, iM7202 + 4, length);
                    m7208(this.f13445, this.f13442 + 1, zM7201 ? iM7202 : this.f13443.f7527, iM7202);
                    this.f13441 = c2269;
                    this.f13442++;
                    if (zM7201) {
                        this.f13443 = c2269;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m7207(byte[] bArr, int i, int i2) throws IOException {
        int iM7202 = m7202(i);
        int i3 = iM7202 + i2;
        int i4 = this.f13445;
        RandomAccessFile randomAccessFile = this.f13446;
        if (i3 <= i4) {
            randomAccessFile.seek(iM7202);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iM7202;
        randomAccessFile.seek(iM7202);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m7208(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f13444;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f13446;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m7200(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final synchronized void m7209() {
        if (m7201()) {
            throw new NoSuchElementException();
        }
        int i = 0;
        if (this.f13442 == 1) {
            synchronized (this) {
                m7208(4096, 0, 0, 0);
                this.f13442 = 0;
                C2268 c2268 = C2268.f7525;
                this.f13443 = c2268;
                this.f13441 = c2268;
                if (this.f13445 > 4096) {
                    RandomAccessFile randomAccessFile = this.f13446;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.f13445 = 4096;
            }
        } else {
            C2268 c2269 = this.f13443;
            int iM7202 = m7202(c2269.f7527 + 4 + c2269.f7526);
            m7204(iM7202, this.f13444, 0, 4);
            int iM7199 = m7199(0, this.f13444);
            m7208(this.f13445, this.f13442 - 1, iM7202, this.f13441.f7527);
            this.f13442--;
            this.f13443 = new C2268(iM7202, iM7199, i);
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final int m7210() {
        if (this.f13442 == 0) {
            return 16;
        }
        C2268 c2268 = this.f13441;
        int i = c2268.f7527;
        int i2 = this.f13443.f7527;
        return i >= i2 ? (i - i2) + 4 + c2268.f7526 + 16 : (((i + 4) + c2268.f7526) + this.f13445) - i2;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final synchronized void m7211(InterfaceC5611 interfaceC5611) {
        int iM7202 = this.f13443.f7527;
        for (int i = 0; i < this.f13442; i++) {
            C2268 c2268M7203 = m7203(iM7202);
            interfaceC5611.mo908(new C5270(this, c2268M7203), c2268M7203.f7526);
            iM7202 = m7202(c2268M7203.f7527 + 4 + c2268M7203.f7526);
        }
    }
}
