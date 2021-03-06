USE [BankDB]
GO
/****** Object:  Table [dbo].[urt]    Script Date: 07/13/2017 11:12:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[urt](
	[Username] [varchar](50) NULL,
	[Password] [varchar](50) NULL,
	[Name] [varchar](50) NULL,
	[Address] [varchar](50) NULL,
	[MobileNo] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[DOB] [varchar](50) NULL,
	[DOJ] [varchar](50) NULL,
	[Usertype] [varchar](50) NULL,
	[Sq] [varchar](50) NULL,
	[Ans] [varchar](50) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[urt] ([Username], [Password], [Name], [Address], [MobileNo], [Email], [DOB], [DOJ], [Usertype], [Sq], [Ans]) VALUES (N'abc', N'abc', N'abc', N'abc', N'abc', N'abc', N'abc', N'abc', N'Employee', N'What is your pet name ?', N'Tomy')
/****** Object:  Table [dbo].[Transactiontable]    Script Date: 07/13/2017 11:12:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Transactiontable](
	[tid] [int] IDENTITY(1,1) NOT NULL,
	[AccountNo] [int] NULL,
	[Date] [varchar](max) NULL,
	[Deposit] [varchar](max) NULL,
	[Withdraw] [varchar](max) NULL,
	[Balance] [varchar](max) NULL,
 CONSTRAINT [PK_Transactiontable] PRIMARY KEY CLUSTERED 
(
	[tid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Transactiontable] ON
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (13, 1, N'14/10/2016', N'7000', N'0', N'7000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (14, 2, N'14/10/2016', N'6000', N'0', N'6000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (15, 1, N'15/10/2016', N'4000', N'0', N'11000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (16, 1, N'15/10/2016', N'2000', N'0', N'13000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (17, 1, N'15/10/2016', N'1000', N'0', N'14000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (18, 1, N'15/10/2016', N'0', N'2000', N'12000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (19, 3, N'5/5/2017', N'7000', N'0', N'7000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (20, 3, N'5/5/2017', N'3000', N'0', N'10000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (21, 3, N'5/5/2017', N'3000', N'0', N'10000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (22, 3, N'5/5/2017', N'0', N'4000', N'6000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (23, 3, N'5/5/2017', N'0', N'4000', N'6000')
INSERT [dbo].[Transactiontable] ([tid], [AccountNo], [Date], [Deposit], [Withdraw], [Balance]) VALUES (24, 1, N'10/7/2017', N'2000', N'0', N'14000')
SET IDENTITY_INSERT [dbo].[Transactiontable] OFF
/****** Object:  Table [dbo].[SavingAccount]    Script Date: 07/13/2017 11:12:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SavingAccount](
	[AccountNo] [int] NULL,
	[Name] [varchar](max) NULL,
	[Address] [varchar](max) NULL,
	[PhoneNo] [varchar](max) NULL,
	[intro_acc_no] [varchar](max) NULL,
	[Balance] [varchar](max) NULL,
	[Opening_date] [varchar](max) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[SavingAccount] ([AccountNo], [Name], [Address], [PhoneNo], [intro_acc_no], [Balance], [Opening_date]) VALUES (0, N'abc', N'abc', N'abc', N'abc', N'abc', N'abc')
INSERT [dbo].[SavingAccount] ([AccountNo], [Name], [Address], [PhoneNo], [intro_acc_no], [Balance], [Opening_date]) VALUES (1, N'Devesh', N'Lucknow', N'9838790770', N'0', N'7000', N'14/10/2016')
INSERT [dbo].[SavingAccount] ([AccountNo], [Name], [Address], [PhoneNo], [intro_acc_no], [Balance], [Opening_date]) VALUES (2, N'prashant', N'Kanpur', N'9838790770', N'0', N'6000', N'14/10/2016')
INSERT [dbo].[SavingAccount] ([AccountNo], [Name], [Address], [PhoneNo], [intro_acc_no], [Balance], [Opening_date]) VALUES (3, N'Sachidanand', N'Lucknow Aliganj', N'9986754232', N'2', N'7000', N'5/5/2017')
/****** Object:  Table [dbo].[FixedAccount]    Script Date: 07/13/2017 11:12:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FixedAccount](
	[AccountNo] [int] NULL,
	[Name] [varchar](50) NULL,
	[Address] [varchar](50) NULL,
	[Phoneno] [varchar](50) NULL,
	[Savingaccount] [varchar](50) NULL,
	[Openingdate] [varchar](50) NULL,
	[Amount] [varchar](50) NULL,
	[Period] [varchar](50) NULL,
	[Interestrate] [varchar](50) NULL,
	[Maturityamount] [varchar](50) NULL,
	[Maturitydate] [varchar](50) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FixedAccount] ([AccountNo], [Name], [Address], [Phoneno], [Savingaccount], [Openingdate], [Amount], [Period], [Interestrate], [Maturityamount], [Maturitydate]) VALUES (100, N'test', N'test', N'test', N'test', N'test', N'test', N'test', N'test', N'test', N'test')
INSERT [dbo].[FixedAccount] ([AccountNo], [Name], [Address], [Phoneno], [Savingaccount], [Openingdate], [Amount], [Period], [Interestrate], [Maturityamount], [Maturitydate]) VALUES (101, N'sachidanand', N'Lucknow Aliganj', N'989898989', N'3', N'5/5/2017', N'200000', N'2', N'9', N'236000', N'5/5/2019')
