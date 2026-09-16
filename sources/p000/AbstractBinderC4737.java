package p000;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: renamed from: ۦُٝؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4737 extends AbstractBinderC0543 implements IInterface {

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f15634;

    public AbstractBinderC4737(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC0487.m1088(bArr.length == 25);
        this.f15634 = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: ۦَ */
    public static byte[] m8059(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC2410 interfaceC2410M8060;
        if (obj instanceof AbstractBinderC4737) {
            try {
                AbstractBinderC4737 abstractBinderC4737 = (AbstractBinderC4737) obj;
                if (abstractBinderC4737.f15634 == this.f15634 && (interfaceC2410M8060 = abstractBinderC4737.m8060()) != null) {
                    return Arrays.equals(mo7140(), (byte[]) BinderC1409.m2976(interfaceC2410M8060));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15634;
    }

    @Override // p000.AbstractBinderC0543
    /* JADX INFO: renamed from: ۥٍ */
    public final boolean mo1238(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC2410 interfaceC2410M8060 = m8060();
            parcel2.writeNoException();
            AbstractC3419.m6198(parcel2, interfaceC2410M8060);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f15634);
        return true;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public abstract byte[] mo7140();

    /* JADX INFO: renamed from: ۦۤ */
    public final InterfaceC2410 m8060() {
        return new BinderC1409(mo7140());
    }
}
