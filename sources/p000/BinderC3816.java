package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.SparseArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ۦٌٍۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3816 extends Binder implements InterfaceC3865 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ int f12641 = 0;

    /* JADX INFO: renamed from: ۥْ */
    public final ExecutorService f12642;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0322 f12643;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4324 f12644;

    public BinderC3816() {
        attachInterface(this, "com.topjohnwu.superuser.internal.IFileSystemService");
        this.f12644 = new C4324(100);
        this.f12643 = new C0322(2, (byte) 0);
        this.f12642 = Executors.newCachedThreadPool();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C1162 c1162;
        C1162 c1163;
        C1162 c1164;
        C1162 c1165;
        C1162 c1166;
        C1162 c1167;
        C1162 c1168;
        long jLseek;
        C1162 c1169;
        C1162 c11610;
        C1162 c11611;
        final int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.topjohnwu.superuser.internal.IFileSystemService");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.topjohnwu.superuser.internal.IFileSystemService");
            return true;
        }
        boolean z = false;
        int iAccess = 0;
        int i4 = 0;
        switch (i) {
            case 1:
                C1162 c1162Mo2061 = mo2061(parcel.readString());
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1162Mo2061);
                return true;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                boolean zMo2068 = mo2068(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2068 ? 1 : 0);
                return true;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zMo2076 = mo2076(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2076 ? 1 : 0);
                return true;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                boolean zMo2075 = mo2075(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2075 ? 1 : 0);
                return true;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                long jMo2062 = mo2062(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jMo2062);
                return true;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                long jMo2070 = mo2070(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jMo2070);
                return true;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C1162 c1162Mo2066 = mo2066(parcel.readString());
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1162Mo2066);
                return true;
            case 8:
                boolean zMo2073 = mo2073(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2073 ? 1 : 0);
                return true;
            case 9:
                String[] strArrMo2059 = mo2059(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo2059);
                return true;
            case 10:
                boolean zMo2072 = mo2072(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2072 ? 1 : 0);
                return true;
            case 11:
                boolean zMo2071 = mo2071(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2071 ? 1 : 0);
                return true;
            case 12:
                boolean zMo2074 = mo2074(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2074 ? 1 : 0);
                return true;
            case 13:
                boolean zMo2064 = mo2064(parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2064 ? 1 : 0);
                return true;
            case 14:
                boolean zMo2067 = mo2067(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo2067 ? 1 : 0);
                return true;
            case 15:
                boolean zMo2079 = mo2079(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo2079 ? 1 : 0);
                return true;
            case 16:
                boolean zMo2077 = mo2077(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo2077 ? 1 : 0);
                return true;
            case 17:
                boolean zMo2065 = mo2065(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo2065 ? 1 : 0);
                return true;
            case 18:
                try {
                    iAccess = Os.access(parcel.readString(), parcel.readInt());
                    break;
                } catch (ErrnoException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(iAccess);
                return true;
            case 19:
                long jMo2078 = mo2078(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jMo2078);
                return true;
            case 20:
                long jMo2060 = mo2060(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jMo2060);
                return true;
            case 21:
                long jMo2080 = mo2080(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeLong(jMo2080);
                return true;
            case 22:
                try {
                    i4 = Os.lstat(parcel.readString()).st_mode;
                    break;
                } catch (ErrnoException unused2) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            case 23:
                String string = parcel.readString();
                String string2 = parcel.readString();
                try {
                    if (parcel.readInt() != 0) {
                        Os.symlink(string2, string);
                    } else {
                        Os.link(string2, string);
                    }
                    c1162 = new C1162(Boolean.TRUE);
                    break;
                } catch (ErrnoException e) {
                    c1162 = e.errno == OsConstants.EEXIST ? new C1162(Boolean.FALSE) : new C1162(e);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1162);
                return true;
            case 24:
                mo2063(parcel.readStrongBinder());
                return true;
            case 25:
                String string3 = parcel.readString();
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                C2540 c2540 = new C2540();
                try {
                    int i6 = OsConstants.O_NONBLOCK;
                    c2540.f8468 = Os.open(string3, i5 | i6, 438);
                    c2540.f8467 = Os.open(string4, OsConstants.O_RDONLY | i6, 0);
                    c2540.f8465 = Os.open(string4, OsConstants.O_WRONLY | i6, 0);
                    c1163 = new C1162(Integer.valueOf(this.f12643.m704(c2540)));
                    break;
                } catch (ErrnoException e2) {
                    c2540.close();
                    c1163 = new C1162(e2);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1163);
                return true;
            case 26:
                String string5 = parcel.readString();
                final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) (parcel.readInt() != 0 ? ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                final C2540 c2541 = new C2540();
                try {
                    c2541.f8468 = Os.open(string5, OsConstants.O_RDONLY, 0);
                    this.f12642.execute(new Runnable() { // from class: ۦٍٓؕؓ
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = i3;
                            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                            C2540 c2542 = c2541;
                            try {
                                try {
                                    switch (i7) {
                                        case 0:
                                            try {
                                                c2542.f8467 = AbstractC2611.m4921(parcelFileDescriptor2.detachFd());
                                                do {
                                                    break;
                                                } while (c2542.m4767(65536, -1L, false) > 0);
                                                c2542.close();
                                                return;
                                            } catch (Throwable th) {
                                                try {
                                                    c2542.close();
                                                    break;
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        default:
                                            try {
                                                c2542.f8465 = AbstractC2611.m4921(parcelFileDescriptor2.detachFd());
                                                do {
                                                    break;
                                                } while (c2542.m4768(-1L, 65536) > 0);
                                                c2542.close();
                                                return;
                                            } catch (Throwable th3) {
                                                try {
                                                    c2542.close();
                                                    break;
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                                throw th3;
                                            }
                                    }
                                } catch (ErrnoException | IOException unused3) {
                                }
                            } catch (ErrnoException | IOException unused4) {
                            }
                        }
                    });
                    c1164 = new C1162();
                    break;
                } catch (ErrnoException e3) {
                    c2541.close();
                    c1164 = new C1162(e3);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1164);
                return true;
            case 27:
                String string6 = parcel.readString();
                final ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) (parcel.readInt() != 0 ? ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                byte b = parcel.readInt() != 0;
                final C2540 c2542 = new C2540();
                try {
                    c2542.f8468 = Os.open(string6, (b != false ? OsConstants.O_APPEND : OsConstants.O_TRUNC) | OsConstants.O_CREAT | OsConstants.O_WRONLY, 438);
                    ExecutorService executorService = this.f12642;
                    final int i7 = z ? 1 : 0;
                    executorService.execute(new Runnable() { // from class: ۦٍٓؕؓ
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i8 = i7;
                            ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor2;
                            C2540 c2543 = c2542;
                            try {
                                try {
                                    switch (i8) {
                                        case 0:
                                            try {
                                                c2543.f8467 = AbstractC2611.m4921(parcelFileDescriptor3.detachFd());
                                                do {
                                                    break;
                                                } while (c2543.m4767(65536, -1L, false) > 0);
                                                c2543.close();
                                                return;
                                            } catch (Throwable th) {
                                                try {
                                                    c2543.close();
                                                    break;
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        default:
                                            try {
                                                c2543.f8465 = AbstractC2611.m4921(parcelFileDescriptor3.detachFd());
                                                do {
                                                    break;
                                                } while (c2543.m4768(-1L, 65536) > 0);
                                                c2543.close();
                                                return;
                                            } catch (Throwable th3) {
                                                try {
                                                    c2543.close();
                                                    break;
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                                throw th3;
                                            }
                                    }
                                } catch (ErrnoException | IOException unused3) {
                                }
                            } catch (ErrnoException | IOException unused4) {
                            }
                        }
                    });
                    c1165 = new C1162();
                    break;
                } catch (ErrnoException e4) {
                    c2542.close();
                    c1165 = new C1162(e4);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1165);
                return true;
            case 28:
                int i8 = parcel.readInt();
                C0322 c0322 = this.f12643;
                synchronized (c0322) {
                    SparseArray sparseArray = (SparseArray) ((SparseArray) c0322.f1178).get(Binder.getCallingPid());
                    if (sparseArray == null) {
                        return true;
                    }
                    C2540 c2543 = (C2540) sparseArray.get(i8);
                    if (c2543 == null) {
                        return true;
                    }
                    sparseArray.remove(i8);
                    synchronized (c2543) {
                        c2543.close();
                        break;
                    }
                    return true;
                }
            case 29:
                try {
                    c1166 = new C1162(Integer.valueOf(this.f12643.m698(parcel.readInt()).m4768(parcel.readLong(), parcel.readInt())));
                    break;
                } catch (ErrnoException | IOException e5) {
                    c1166 = new C1162(e5);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1166);
                return true;
            case 30:
                try {
                    this.f12643.m698(parcel.readInt()).m4767(parcel.readInt(), parcel.readLong(), true);
                    c1167 = new C1162();
                    break;
                } catch (ErrnoException | IOException e6) {
                    c1167 = new C1162(e6);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1167);
                return true;
            case 31:
                int i9 = parcel.readInt();
                long j = parcel.readLong();
                int i10 = parcel.readInt();
                try {
                    C2540 c2540M698 = this.f12643.m698(i9);
                    synchronized (c2540M698) {
                        FileDescriptor fileDescriptor = c2540M698.f8468;
                        if (fileDescriptor == null) {
                            throw new ClosedChannelException();
                        }
                        jLseek = Os.lseek(fileDescriptor, j, i10);
                    }
                    c1168 = new C1162(Long.valueOf(jLseek));
                } catch (ErrnoException | IOException e7) {
                    c1168 = new C1162(e7);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1168);
                return true;
            case 32:
                try {
                    c1169 = new C1162(Long.valueOf(this.f12643.m698(parcel.readInt()).size()));
                    break;
                } catch (ErrnoException | IOException e8) {
                    c1169 = new C1162(e8);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c1169);
                return true;
            case 33:
                int i11 = parcel.readInt();
                long j2 = parcel.readLong();
                try {
                    C2540 c2540M699 = this.f12643.m698(i11);
                    synchronized (c2540M699) {
                        FileDescriptor fileDescriptor2 = c2540M699.f8468;
                        if (fileDescriptor2 == null) {
                            throw new ClosedChannelException();
                        }
                        Os.ftruncate(fileDescriptor2, j2);
                    }
                    c11610 = new C1162();
                } catch (ErrnoException | IOException e9) {
                    c11610 = new C1162(e9);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c11610);
                return true;
            case 34:
                try {
                    this.f12643.m698(parcel.readInt()).m4769(parcel.readInt() != 0);
                    c11611 = new C1162();
                    break;
                } catch (ErrnoException | IOException e10) {
                    c11611 = new C1162(e10);
                }
                parcel2.writeNoException();
                AbstractC4009.m7149(parcel2, c11611);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥؙ */
    public final String[] mo2059(String str) {
        return ((File) this.f12644.get(str)).list();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥِ */
    public final long mo2060(String str) {
        return ((File) this.f12644.get(str)).getFreeSpace();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٓ */
    public final C1162 mo2061(String str) {
        try {
            return new C1162(((File) this.f12644.get(str)).getCanonicalPath());
        } catch (IOException e) {
            return new C1162(e);
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٛ */
    public final long mo2062(String str) {
        return ((File) this.f12644.get(str)).lastModified();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٞ */
    public final void mo2063(IBinder iBinder) {
        final int callingPid = Binder.getCallingPid();
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: ۥّٖؗۢ
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    BinderC3816 binderC3816 = this.f4064;
                    int i = callingPid;
                    C0322 c0322 = binderC3816.f12643;
                    synchronized (c0322) {
                        SparseArray sparseArray = (SparseArray) ((SparseArray) c0322.f1178).get(i);
                        if (sparseArray == null) {
                            return;
                        }
                        ((SparseArray) c0322.f1178).remove(i);
                        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                            ((C2540) sparseArray.valueAt(i2)).close();
                        }
                    }
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۖ */
    public final boolean mo2064(long j, String str) {
        return ((File) this.f12644.get(str)).setLastModified(j);
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۘ */
    public final boolean mo2065(String str, boolean z, boolean z2) {
        return ((File) this.f12644.get(str)).setExecutable(z, z2);
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۙ */
    public final C1162 mo2066(String str) {
        try {
            return new C1162(Boolean.valueOf(((File) this.f12644.get(str)).createNewFile()));
        } catch (IOException e) {
            return new C1162(e);
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۢ */
    public final boolean mo2067(String str) {
        return ((File) this.f12644.get(str)).setReadOnly();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۦ */
    public final boolean mo2068(String str) {
        return ((File) this.f12644.get(str)).isDirectory();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۧ */
    public final boolean mo2069(int i, String str) {
        try {
            return Os.access(str, i);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦ */
    public final long mo2070(String str) {
        return ((File) this.f12644.get(str)).length();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؒ */
    public final boolean mo2071(String str) {
        return ((File) this.f12644.get(str)).mkdirs();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؓ */
    public final boolean mo2072(String str) {
        return ((File) this.f12644.get(str)).mkdir();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؗ */
    public final boolean mo2073(String str) {
        return ((File) this.f12644.get(str)).delete();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo2074(String str, String str2) {
        C4324 c4324 = this.f12644;
        return ((File) c4324.get(str)).renameTo((File) c4324.get(str2));
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo2075(String str) {
        return ((File) this.f12644.get(str)).isHidden();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٕ */
    public final boolean mo2076(String str) {
        return ((File) this.f12644.get(str)).isFile();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٚ */
    public final boolean mo2077(String str, boolean z, boolean z2) {
        return ((File) this.f12644.get(str)).setReadable(z, z2);
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo2078(String str) {
        return ((File) this.f12644.get(str)).getTotalSpace();
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean mo2079(String str, boolean z, boolean z2) {
        return ((File) this.f12644.get(str)).setWritable(z, z2);
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦ۟ */
    public final long mo2080(String str) {
        return ((File) this.f12644.get(str)).getUsableSpace();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
