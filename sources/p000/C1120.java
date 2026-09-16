package p000;

import android.os.RemoteException;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۥِْؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1120 extends AbstractC3048 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3865 f3936;

    public C1120(InterfaceC3865 interfaceC3865, String str) {
        super(str);
        this.f3936 = interfaceC3865;
    }

    @Override // java.io.File
    public final boolean canExecute() {
        return m2349(OsConstants.X_OK);
    }

    @Override // java.io.File
    public final boolean canRead() {
        return m2349(OsConstants.R_OK);
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return m2349(OsConstants.W_OK);
    }

    @Override // java.io.File
    public final boolean createNewFile() throws IOException {
        try {
            Object obj = this.f3936.mo2066(getPath()).f4031;
            if (obj instanceof Throwable) {
                throw new IOException("Exception thrown on remote process", (Throwable) obj);
            }
            return ((Boolean) obj).booleanValue();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.File
    public final boolean delete() {
        try {
            return this.f3936.mo2073(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final void deleteOnExit() {
        throw new UnsupportedOperationException("deleteOnExit() is not supported in RemoteFile");
    }

    @Override // java.io.File
    public final boolean exists() {
        return m2349(OsConstants.F_OK);
    }

    @Override // java.io.File
    public final String getCanonicalPath() throws IOException {
        try {
            Object obj = this.f3936.mo2061(getPath()).f4031;
            if (obj instanceof Throwable) {
                throw new IOException("Exception thrown on remote process", (Throwable) obj);
            }
            return (String) obj;
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.File
    public final long getFreeSpace() {
        try {
            return this.f3936.mo2060(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long getTotalSpace() {
        try {
            return this.f3936.mo2078(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long getUsableSpace() {
        try {
            return this.f3936.mo2080(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        try {
            return this.f3936.mo2068(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean isFile() {
        try {
            return this.f3936.mo2076(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean isHidden() {
        try {
            return this.f3936.mo2075(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final long lastModified() {
        try {
            return this.f3936.mo2062(getPath());
        } catch (RemoteException unused) {
            return Long.MIN_VALUE;
        }
    }

    @Override // java.io.File
    public final long length() {
        try {
            return this.f3936.mo2070(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final String[] list() {
        try {
            return this.f3936.mo2059(getPath());
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // java.io.File
    public final boolean mkdir() {
        try {
            return this.f3936.mo2072(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean mkdirs() {
        try {
            return this.f3936.mo2071(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        try {
            return this.f3936.mo2074(getPath(), file.getAbsolutePath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setExecutable(boolean z, boolean z2) {
        try {
            return this.f3936.mo2065(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setLastModified(long j) {
        try {
            return this.f3936.mo2064(j, getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setReadOnly() {
        try {
            return this.f3936.mo2067(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setReadable(boolean z, boolean z2) {
        try {
            return this.f3936.mo2077(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setWritable(boolean z, boolean z2) {
        try {
            return this.f3936.mo2079(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p000.AbstractC3048
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1333[] mo2348(int i) {
        return new C1120[i];
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m2349(int i) {
        try {
            return this.f3936.mo2069(i, getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p000.AbstractC3048
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1333 mo2350(String str) {
        return new C1120(this.f3936, str);
    }

    @Override // p000.AbstractC3048
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1333 mo2351(String str) {
        return new C1120(this.f3936, getPath(), str);
    }

    public C1120(InterfaceC3865 interfaceC3865, String str, String str2) {
        super(str, str2);
        this.f3936 = interfaceC3865;
    }
}
