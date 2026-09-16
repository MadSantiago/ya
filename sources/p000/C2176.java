package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: ۥۘؖؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2176 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f7179;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7180;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f7181;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f7182;

    public C2176(int i, int i2, long j, long j2) {
        this.f7181 = i;
        this.f7180 = i2;
        this.f7179 = j;
        this.f7182 = j2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2176 m4227(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C2176 c2176 = new C2176(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c2176;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2176)) {
            C2176 c2176 = (C2176) obj;
            if (this.f7180 == c2176.f7180 && this.f7179 == c2176.f7179 && this.f7181 == c2176.f7181 && this.f7182 == c2176.f7182) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7180), Long.valueOf(this.f7179), Integer.valueOf(this.f7181), Long.valueOf(this.f7182));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4228(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f7181);
            dataOutputStream.writeInt(this.f7180);
            dataOutputStream.writeLong(this.f7179);
            dataOutputStream.writeLong(this.f7182);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
